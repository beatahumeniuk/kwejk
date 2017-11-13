package pl.akademiakodu.Kwejk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

}
