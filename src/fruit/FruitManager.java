package fruit;

import Laptop.Laptop;
import javafx.scene.control.Label;
import javafx.scene.control.TableRow;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FruitManager {
    ArrayList<Fruit> fruits = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayAllFruit() {
        fruits.forEach(System.out::println);
    }

    public ArrayList<Fruit> displayApple(String apple) {
        ArrayList<Fruit> displayApple = new ArrayList<>();
        for (Fruit f: fruits) {
            if (f.getName().equalsIgnoreCase(apple)) {
               displayApple.add(f);
            }
        }
        return displayApple;
    }

    public ArrayList<Fruit> displayBanana(String banana) {
        ArrayList<Fruit> displayBanana = new ArrayList<>();
        for (Fruit f: fruits) {
            if (f.getName().equalsIgnoreCase(banana)) {
                displayBanana.add(f);
            }
        }
        return displayBanana;
    }

    public ArrayList<Fruit> displayLemon(String lemon) {
        ArrayList<Fruit> displayLemon = new ArrayList<>();
        for (Fruit f: fruits) {
            if (f.getName().equalsIgnoreCase(lemon)) {
                displayLemon.add(f);
            }
        }
        return displayLemon;
    }

    public Fruit findMaxPrice() {
        Fruit fruit = null;
        double max = fruits.get(0).getPrice();
        for (Fruit f: fruits) {
            if (f.getPrice() > max) {
                fruit = f;
            }
        }
        return fruit;
    }

    public void buyIn1Million() {

    }

    public Fruit createFruit() {
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Weight: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Taste: ");
        String taste = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Color: ");
        String color = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        return new Fruit(name, weight, taste, color, price);
    }

    public void addByName(Fruit fruit) {
        fruits.add(fruit);
    }

    public Fruit deleteByName(String name) {
        Fruit fruit = null;
        for (Fruit f: fruits) {
            if (f.getName().equalsIgnoreCase(name)) {
                fruit = f;
                fruits.remove(fruit);
            }
        }
        return fruit;
    }
}
