package pl.akademiakodu.Kwejk.model;


import java.util.ArrayList;
import java.util.List;

public class GifDaoImpl{

   public List<Gif> findAll(){
       List<Gif> gifs = new ArrayList<>();

       gifs.add(new Gif("android-explosion.gif"));
       gifs.add(new Gif("ben-and-mike.gif"));
       gifs.add(new Gif("book-dominos.gif"));
       gifs.add(new Gif("compiler-bot.gif"));
       gifs.add(new Gif("cowboy-coder.gif"));
       gifs.add(new Gif("infinite-andrew.gif"));
       return gifs;
    }
}
