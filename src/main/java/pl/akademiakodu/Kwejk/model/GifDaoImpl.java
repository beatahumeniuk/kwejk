package pl.akademiakodu.Kwejk.model;


import java.util.ArrayList;
import java.util.List;

public class GifDaoImpl{

   public List<Gif> findAll(){
       List<Gif> gifs = new ArrayList<>();

       gifs.add(new Gif("android-explosion"));
       gifs.add(new Gif("ben-and-mike"));
       gifs.add(new Gif("book-dominos"));
       gifs.add(new Gif("compiler-bot"));
       gifs.add(new Gif("cowboy-coder"));
       gifs.add(new Gif("infinite-andrew"));
       return gifs;
    }
}
