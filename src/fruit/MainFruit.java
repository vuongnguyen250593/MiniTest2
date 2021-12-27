package fruit;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFruit {
    public static void main(String[] args) {
        FruitManager fruitManager = new FruitManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("---------------");
            System.out.println("*******  Menu  *******");
            System.out.println("1. Display all Fruit");
            System.out.println("2. Display Apple");
            System.out.println("3. Display Banana");
            System.out.println("4. Display Lemon");
            System.out.println("5. Find max Price");
            System.out.println("6. Buy in 1.000.000");
            System.out.println("7. Add by Name");
            System.out.println("8. Delete by Name");
            System.out.println("0. Exit");
            System.out.println("---------------");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("---------------");
            switch (choice) {
                case 1:
                    System.out.println("1. Display all Fruit");
                    fruitManager.displayAllFruit();
                    break;
                case 2:
                    System.out.println("2. Display Apple");
                    ArrayList<Fruit> displayApple = fruitManager.displayApple("apple");
                    displayApple.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("3. Display Banana");
                    ArrayList<Fruit> displayBanana = fruitManager.displayBanana("banana");
                    displayBanana.forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("4. Display Lemon");
                    ArrayList<Fruit> displayLemon = fruitManager.displayLemon("lemon");
                    displayLemon.forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("5. Find max Price");
                    System.out.println(fruitManager.findMaxPrice());
                    break;
                case 6:
                    System.out.println("6. Buy in 1.000.000");
                    break;
                case 7:
                    System.out.println("7. Add by Name");
                    Fruit fruit = fruitManager.createFruit();
                    fruitManager.addByName(fruit);
                    break;
                case 8:
                    System.out.println("8. Delete by Name");
                    System.out.print("Enter name that you want to delete: ");
                    String name = scanner.nextLine();
                    System.out.println();
                    System.out.println(fruitManager.deleteByName(name));
                    break;
            }
        } while (choice != 0);
    }

}
