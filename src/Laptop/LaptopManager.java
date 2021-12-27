package Laptop;

import human.Human;
import javafx.scene.control.Label;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaptopManager {
    ArrayList<Laptop> laptops = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Laptop createLaptop() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Color: ");
        String color = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Amount: ");
        int amount = scanner.nextInt();
        return new Laptop(id, brand, color, price, amount);
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public Laptop updateLaptop(int id) {
        Laptop laptop = null;
        for (Laptop laptop1: laptops) {
            if (laptop1.getId() == id) {
                laptop = laptop1;
            }
        }

        if (laptop != null) {
            int index = laptops.indexOf(laptop);
            scanner.nextLine();
            System.out.print("Re-Enter Brand: ");
            String newBrand = scanner.nextLine();
            laptop.setBrand(newBrand);
            scanner.nextLine();
            System.out.print("Re-Enter Color: ");
            String newColor = scanner.nextLine();
            laptop.setColor(newColor);
            scanner.nextLine();
            System.out.print("Re-Enter Price: ");
            double newPrice = scanner.nextDouble();
            laptop.setPrice(newPrice);
            System.out.print("Re-Enter Amount: ");
            int newAmount = scanner.nextInt();
            laptop.setAmount(newAmount);
            laptops.set(index,laptop);
        }
        return laptop;
    }

    public Laptop deleteLaptop(int id) {
        Laptop laptop = null;
        for (Laptop laptop1: laptops) {
            if (laptop1.getId() == id) {
                laptop = laptop1;
            }
        }
        laptops.remove(laptop);
        return laptop;
    }

    public void displayAllLaptop() {
        laptops.forEach(System.out::println);
    }

    public ArrayList<Laptop> searchByBrand(String brand) {
        ArrayList<Laptop> laptopBrand = new ArrayList<>();
        Laptop laptop = null;
        for (Laptop l: laptops) {
            if (l.getBrand().equalsIgnoreCase(brand)) {
                laptop = l;
                laptopBrand.add(laptop);
            }
        }
        return laptopBrand;
    }

    public ArrayList<Laptop> searchByPrice(int choice) {
        ArrayList<Laptop> laptop = new ArrayList<>();
        switch (choice) {
            case 1:
                for (Laptop l1: laptops) {
                    if (l1.getPrice() < 5000000) {
                        laptop.add(l1);
                    }
                }
                break;
            case 2:
                for (Laptop l2: laptops) {
                    if (l2.getPrice() >= 5000000 && l2.getPrice() <= 10000000) {
                        laptop.add(l2);
                    }
                }
                break;
            case 3:
                for (Laptop l3: laptops) {
                    if (l3.getPrice() > 10000000) {
                        laptop.add(l3);
                    }
                }
                break;
        }
        return laptop;
    }

    public ArrayList<Laptop> displayByBrand(String brand) {
        ArrayList<Laptop> laptopBrand = new ArrayList<>();
        Laptop laptop = null;
        for (Laptop l: laptops) {
            if (l.getBrand().equalsIgnoreCase(brand)) {
                laptop = l;
                laptopBrand.add(laptop);
            }
        }
        return laptopBrand;
    }

    public ArrayList<Laptop> searchByColor(String color) {
        ArrayList<Laptop> laptopColor = new ArrayList<>();
        for (Laptop l: laptops) {
            if (l.getColor().equalsIgnoreCase(color)) {
                laptopColor.add(l);
            }
        }
        return laptopColor;
    }

    public static void writeToFile(String path, List<Laptop> laptops) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(laptops);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Laptop> readDataFromFile(String path) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            laptops = (ArrayList<Laptop>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return laptops;
    }
}
