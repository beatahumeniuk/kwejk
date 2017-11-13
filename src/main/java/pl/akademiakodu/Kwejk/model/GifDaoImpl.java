package pl.akademiakodu.Kwejk.model;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GifDaoImpl implements GifDao {

    private static List<String> names = new ArrayList<>();

    static {
        names.add("android-explosion");
        names.add("ben-and-mike");
        names.add("book-dominos");
        names.add("compiler-bot");
        names.add("cowboy-coder");
        names.add("infinite-andrew");
    }


    public List<Gif> findAll() {
        List<Gif> gifs = new ArrayList<>();
        int i = 1;
        for (String name : names) {
            gifs.add(new Gif(name, "username" + i++));
        }
        return gifs;
    }

    public Gif findOne(String name)
    {
        return findAll().stream().filter((a)->a.getName().equals(name)).collect(Collectors.toList()).get(0);
    }
// przykladowa metoda ustawiajaca co drugi gif jako ulubiony
    public List <Gif> anyFavoritiesGifs()
    {
        List<Gif> anyFavorities = new ArrayList<>();
        boolean setFav = true;
        for (Gif g : findAll())
        {
            if(setFav) {
                g.setFavourite(setFav);
                anyFavorities.add(g);
                setFav = false;
            }
            else
                {
                g.setFavourite(setFav);
                anyFavorities.add(g);
                setFav = true;
            }

        }
    return anyFavorities;
    }
    public List<Gif> findFavorites()
    {
        List<Gif> favoritiesGifs = new ArrayList<>();
        for (Gif g : anyFavoritiesGifs())
        {
            if(g.isFavourite())
                favoritiesGifs.add(g);
        }
    return favoritiesGifs;
    }
}

