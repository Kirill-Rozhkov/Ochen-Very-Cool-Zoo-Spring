package kz.aitu.ochenverycoolzoo;

import kz.aitu.ochenverycoolzoo.controllers.AnimalController;
import kz.aitu.ochenverycoolzoo.models.Item;
import kz.aitu.ochenverycoolzoo.models.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private final AnimalController controller;
    private final Scanner scanner;
    private Player player;

    public MyApplication(AnimalController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
        player = new Player();
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to Ochen Very Cool Zoo");
            System.out.println("Select option:");
            System.out.println("1. Fill up the purse");
            System.out.println("2. Store");
            System.out.println("3. Bag");
            System.out.println("4. Pavilions");
            System.out.println();
            try {
                System.out.print("Enter option (1-4): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    player.addCoins();
                } else if (option == 2) {
                    System.out.println();
                } else if (option == 3) {
                    System.out.println("Bag menu");
                } else if (option == 4) {
                    System.out.println("Pavilions menu");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer: " + e);
                scanner.nextLine();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("*************************");
        }
    }

    private void storeMenu() {
        String response = controller.getAllItems();

        System.out.println("Store menu");
        System.out.println("Your have " + player.getCoins() + " coins");

        System.out.println("Select the item you are going to buy (1-" + response.length() + "): ");
        System.out.println(response);

        int id = scanner.nextInt();
        Item item = controller.getItem(id);
        player.addItem(item);
    }

    public void getAnimalsByLocationMenu() {
        String response = controller.getAnimalsByLocation();
        System.out.println(response);
    }
}
