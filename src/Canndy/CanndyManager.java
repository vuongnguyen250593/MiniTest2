package Canndy;

import javafx.scene.canvas.Canvas;

import javax.xml.soap.SAAJResult;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CanndyManager {
    ArrayList<Canndy> canndies = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayAllCanndy() {
        System.out.println(canndies);
    }

    public void addCanndy() {
        System.out.print("Enter Color: ");
        String color = scanner.nextLine();
        System.out.print("Enter Property: ");
        String property = scanner.nextLine();
        System.out.print("Enter Amount: ");
        int amount = scanner.nextInt();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        Canndy canndy = new Canndy(color, property, amount, price);
        canndies.add(canndy);
    }

    public void deleteCanndyById() {
        System.out.print("Enter ID that you to delete: ");
        int id = scanner.nextInt();
        for (int i = 0; i < canndies.size(); i++) {
            if (canndies.get(i).getId() == id) {
                canndies.remove(i);
            }
        }
        System.out.println(canndies);
    }

    public void editCanndy() {

    }

    public void searchById() {
        System.out.print("Enter ID that you want to search: ");
        int id = scanner.nextInt();
        for (int i = 0; i < canndies.size(); i++) {
            if (canndies.get(i).getId() == id) {
                System.out.println(canndies.get(i));
            }
        }
    }

    public void deleteByColor() {
        System.out.print("Enter Color that you to delete: ");
        String color = scanner.nextLine();
        for (int i = 0; i < canndies.size(); i++) {
            if (canndies.get(i).getColor().equals(color)) {
                canndies.remove(i);
            }
        }
        System.out.println(canndies);
    }

    public void searchByColor() {
        System.out.print("Enter Color that you want to search: ");
        String color = scanner.nextLine();
        for (int i = 0; i < canndies.size(); i++) {
            if (canndies.get(i).getColor().equals(color)) {
                System.out.println(canndies.get(i));
            }
        }
    }

    public void maxPrice() {
        double maxPrice = canndies.get(0).getPrice();
        for (int i = 0; i < canndies.size(); i++) {
            if (canndies.get(i).getPrice() > maxPrice) {
                maxPrice = canndies.get(i).getPrice();
            }
        }
        System.out.println("Max Price = " + maxPrice);
    }

    public void totalPrice() {
        double total = 0;
        for (int i = 0; i < canndies.size(); i++) {
            total = total + canndies.get(i).getPrice() * canndies.get(i).getAmount();
        }
        System.out.println("Total price = " + total);
    }
}
