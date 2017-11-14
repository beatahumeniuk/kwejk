package pl.akademiakodu.Kwejk.model;

public class Gif {

    private String name;
    private String username;
    private boolean isFavourite;
    public Gif() {
    }

    public Gif(String name, String username) {

        this.name = name;
        this.username = username;
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

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
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

}