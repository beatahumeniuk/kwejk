package pl.akademiakodu.Kwejk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.Kwejk.model.Category;
import pl.akademiakodu.Kwejk.model.Gif;
import pl.akademiakodu.Kwejk.model.GifDaoImpl;



@Controller
public class KwejkController {

    GifDaoImpl gifDao = new GifDaoImpl();

@GetMapping("/")
    public String getNameOfGif(ModelMap modelMap){
        modelMap.put("gifs", gifDao.findAll());
        return "home";  }


    @GetMapping("/gif/{name}")
        public String details(@PathVariable ("name") String name, ModelMap modelMap)        {
            modelMap.addAttribute("gif", gifDao.findOne(name));
            return "gif-details";
        }

    @GetMapping("/favorites")
    public String favorites(ModelMap modelMap){
        modelMap.addAttribute("fav", gifDao.findFavorites());

        return "favorites";
    }

    @GetMapping("/categories")
    public String categories(ModelMap modelMap){
        modelMap.put("categories", gifDao.showCategory());
        return "categories";
    }
    @GetMapping("/category/{id}")
    public String category(@PathVariable ("id") int id, ModelMap modelMap)
    {       modelMap.addAttribute("category", gifDao.findCategoryById(id));
            modelMap.addAttribute("gifsWithCategory", gifDao.findByCategory(id));
        return "category";
    }


    @GetMapping("/search")
    public String searchByname(@RequestParam String q, ModelMap modelMap)
    {
       if(gifDao.getSearchByName(q).isEmpty())
            modelMap.addAttribute("g", gifDao.searchingFailed());
        else
           modelMap.addAttribute("g", gifDao.getSearchByName(q));
        return "search";

    }



}
