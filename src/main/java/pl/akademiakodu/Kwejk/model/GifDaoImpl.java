package pl.akademiakodu.Kwejk.model;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GifDaoImpl implements GifDao {

    public List<Gif> findAll() {
        List<Gif> gifs = new ArrayList<>();

        gifs.add(new Gif("android-explosion"));
        gifs.add(new Gif("ben-and-mike"));
        gifs.add(new Gif("book-dominos"));
        gifs.add(new Gif("compiler-bot"));
        gifs.add(new Gif("cowboy-coder"));
        gifs.add(new Gif("infinite-andrew"));
        return gifs;
    }

    public Gif getOneByName(String name) {
        List<Gif> gifs = findAll();
        for (Gif g : gifs) {
            if (g.getName().equals(name))
                return g;
        }

    return null;
    }

    public Gif findOne(String name)
    {
        return findAll().stream().filter((a)->a.getName().equals(name)).collect(Collectors.toList()).get(0);
    }

}

