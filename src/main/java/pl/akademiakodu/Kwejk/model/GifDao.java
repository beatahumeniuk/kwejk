package pl.akademiakodu.Kwejk.model;

import java.util.List;

public interface GifDao{
    List<Gif> findAll();
    Gif findOne(String name);
    List<Gif> findFavorites();
}