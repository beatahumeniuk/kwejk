package pl.akademiakodu.Kwejk.model;

public class Gif {

    private String name;
    private String username;
    private boolean isFavourite;
    Category category;

    public Gif() {
    }

    public Gif(String name, String username) {

        this.name = name;
        this.username = username;
    }

    public Gif(String name, String username, Category category) {
        this.name = name;
        this.username = username;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean isFavourite) {
        this.isFavourite = isFavourite;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return getName()+".gif";
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
