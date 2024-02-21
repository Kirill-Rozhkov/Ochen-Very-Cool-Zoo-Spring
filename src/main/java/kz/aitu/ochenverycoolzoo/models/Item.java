package kz.aitu.ochenverycoolzoo.models;

public class Item {
    private static int id = 0;
    private String name;
    private int price;

    public Item(String name, int price) {
        id++;
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getInfo() {
        return name + " - " + price;
    }
}
