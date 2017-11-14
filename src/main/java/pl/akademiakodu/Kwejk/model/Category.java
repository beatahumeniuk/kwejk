package pl.akademiakodu.Kwejk.model;

public class Category {

    private int id;
    private String name;
    static int counter = 0;

    public Category(int id, String name) {
        this.id = counter;
        this.name = name;
        counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
