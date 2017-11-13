package pl.akademiakodu.Kwejk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.Kwejk.model.Gif;
import pl.akademiakodu.Kwejk.model.GifDaoImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class KwejkController {

    GifDaoImpl gifDao = new GifDaoImpl();

    @GetMapping("/")
    public String getNameOfGif(ModelMap modelMap){
        modelMap.put("gifs", gifDao.findAll());
        return "home";  }


    @RequestMapping("gif/{name}")
        public String showOneGif(@PathVariable String name, ModelMap modelMap)
        {
            modelMap.addAttribute("gif",  gifDao.findOne(name));
            return "gif-details";
        }
}
