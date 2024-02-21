package kz.aitu.ochenverycoolzoo.models;

import java.util.ArrayList;

public class Store {
    private ArrayList<Item> items;

    public Store(Item i) {
        items.add(i);
    }

    public void sellItem(int id, Player player) {
        Item item = items.get(id);

        if (player.getCoins() >= item.getPrice()) {
            player.addItem(item);
        } else {
            System.out.println("You don't have enough money");
        }
    }
}
