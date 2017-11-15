package pl.akademiakodu.Kwejk.model;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GifDaoImpl implements GifDao {

    static List<String> names = new ArrayList<>();

    static {
        names.add("android-explosion");
        names.add("ben-and-mike");
        names.add("book-dominos");
        names.add("compiler-bot");
        names.add("cowboy-coder");
        names.add("infinite-andrew");
    }

    static List<Category> categories = new ArrayList<>();

    static {
        categories.add(new Category(4, "Android"));
        categories.add(new Category(5, "Funny"));
        categories.add(new Category(6, "Programming"));
    }

    private static List<Gif> gifs = new ArrayList<>();

    static {
        gifs.add(new Gif(names.get(0), "Username", categories.get(0)));
        gifs.add(new Gif(names.get(1), "Username1", categories.get(1)));
        gifs.add(new Gif(names.get(2), "Username2", categories.get(2)));
        gifs.add(new Gif(names.get(3), "Username3", categories.get(2)));
        gifs.add(new Gif(names.get(4), "Username4", categories.get(2)));
        gifs.add(new Gif(names.get(5), "Username5", categories.get(1)));
    }


    public List<Gif> findAll() {

        return gifs;
    }

    public Gif findOne(String name) {

        return findAll().stream().filter((a) -> a.getName().equals(name)).collect(Collectors.toList()).get(0);
    }

    // przykladowa metoda ustawiajaca co drugi gif jako ulubiony
    public List<Gif> anyFavoritiesGifs() {
        List<Gif> anyFavorities = new ArrayList<>();
        boolean setFav = true;
        for (Gif g : gifs) {
            if (setFav) {
                g.setFavourite(setFav);
                anyFavorities.add(g);
                setFav = false;
            } else {
                g.setFavourite(setFav);
                anyFavorities.add(g);
                setFav = true;
            }

        }
        return anyFavorities;
    }

    public List<Gif> findFavorites() {
        List<Gif> favoritiesGifs = new ArrayList<>();
        for (Gif g : anyFavoritiesGifs()) {
            if (g.isFavourite())
                favoritiesGifs.add(g);
        }
        return favoritiesGifs;
    }


    public List<Category> showCategory() {
        return categories;
    }

    public List<Gif> findByCategory(int id) {
        List<Gif> oneCategory = new ArrayList<>();
        for (Gif g : gifs) {
            if (g.category.getId() == id)
                oneCategory.add(g);
        }
        return oneCategory;
    }

    public Category findCategoryById(int id) {

        for (Category category : categories) {
            if (category.getId() == id)
                return category;
        }
        return null;
    }
    public List<Gif> getSearchByName(String name){
        List<Gif> searchAll = new ArrayList<>();
        for(Gif g: gifs){
            if(g.getName().contains((name.toLowerCase()))) {
                searchAll.add(g);
            }
        }
        for(Gif addGif: gifs){
            if(addGif.getCategory().getName().compareTo(name.toLowerCase())==0){
                searchAll.add(addGif);
            }
        }
        return searchAll;
    }

}

