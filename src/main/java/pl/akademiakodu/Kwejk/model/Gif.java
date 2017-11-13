package pl.akademiakodu.Kwejk.model;

public class Gif {

    private String name;
    private String url;
    private boolean isFavourite;
    public Gif() {
    }

    public Gif(String name) {
        this.name = name;
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

    public String getUrl() {
        return getName()+".gif";
    }

}
