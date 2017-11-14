package pl.akademiakodu.Kwejk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.Kwejk.model.GifDaoImpl;

import javax.xml.ws.ResponseWrapper;


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
        modelMap.addAttribute("cat", gifDao.showCategory());
        return "categories";
    }
}
