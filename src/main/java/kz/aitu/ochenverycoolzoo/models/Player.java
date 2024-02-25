package kz.aitu.ochenverycoolzoo.models;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;

@Data
public class Player {
    @Getter
    private int coins = 500;
    @Getter
    private int animal_coins = 0;
    private ArrayList<Item> bag;
    private WalletTimer walletTimer;

    public Player() {
        walletTimer = new WalletTimer(5);
    }

    public void addCoins() {
        if (walletTimer.isTimeExpired()) {
            coins += 100;
            System.out.println("Coins added!");
        } else {
            System.out.println("It's early to add coins");
        }
    }

    public void removeCoins(int c) {
        coins -= c;
    }

    public void addAnimalCoins() {
        animal_coins += 5;
    }

    public void removeAnimalCoins() {
        animal_coins -= 50;
    }

    public void addItem(Item item) {
        bag.add(item);
        coins -= item.getPrice();
    }
}
