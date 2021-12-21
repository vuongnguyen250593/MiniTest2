package Canndy;

import java.util.Scanner;

public class MainCanndy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CanndyManager canndyManager = new CanndyManager();

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Display all Canndy");
            System.out.println("2. Add a canndy");
            System.out.println("3. Delete a canndy by ID");
            System.out.println("4. Edit a canndy by ID");
            System.out.println("5. Search canndy by ID");
            System.out.println("6. Delete canndys by color");
            System.out.println("7. Search canndys by color");
            System.out.println("8. Max canndys price");
            System.out.println("9. Total canndys price");
            System.out.println("0. Exit");
            System.out.println("---------------");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Display all Canndy");
                    canndyManager.displayAllCanndy();
                    break;
                case 2:
                    System.out.println("2. Add a canndy");
                    canndyManager.addCanndy();
                    break;
                case 3:
                    System.out.println("3. Delete a canndy by ID");
                    canndyManager.deleteCanndyById();
                    break;
                case 4:
                    System.out.println("4. Edit a canndy by ID");
                    canndyManager.editCanndy();
                    break;
                case 5:
                    System.out.println("5. Search canndy by ID");
                    canndyManager.searchById();
                    break;
                case 6:
                    System.out.println("6. Delete canndys by color");
                    canndyManager.deleteByColor();
                    break;
                case 7:
                    System.out.println("7. Search canndys by color");
                    canndyManager.searchByColor();
                    break;
                case 8:
                    System.out.println("8. Max canndys price");
                    canndyManager.maxPrice();
                    break;
                case 9:
                    System.out.println("9. Total canndys price");
                    canndyManager.totalPrice();
                    break;
                default:
                    break;
            }
        } while (choice != 0);
    }
}
