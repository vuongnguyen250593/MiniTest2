package Candy;

import java.util.Scanner;

public class MainCandy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CandyManager candyManager = new CandyManager();

        int choice;
        do {
            System.out.println("---------------");
            System.out.println("*******  Menu  *******");
            System.out.println("1. Display all Candy");
            System.out.println("2. Add a candy");
            System.out.println("3. Delete a candy by ID");
            System.out.println("4. Edit a candy by ID");
            System.out.println("5. Search candy by ID");
            System.out.println("6. Delete candys by color");
            System.out.println("7. Search candys by color");
            System.out.println("8. Max candys price");
            System.out.println("9. Total candys price");
            System.out.println("0. Exit");
            System.out.println("---------------");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("---------------");
            switch (choice) {
                case 1:
                    System.out.println("1. Display all Candy");
                    candyManager.displayAllCandy();
                    break;
                case 2:
                    System.out.println("2. Add a candy");
                    candyManager.addCandy();
                    break;
                case 3:
                    System.out.println("3. Delete a candy by ID");
                    candyManager.deleteCandyById();
                    break;
                case 4:
                    System.out.println("4. Edit a candy by ID");
                    candyManager.editCandy();
                    break;
                case 5:
                    System.out.println("5. Search candy by ID");
                    candyManager.searchById();
                    break;
                case 6:
                    System.out.println("6. Delete candies by color");
                    candyManager.deleteByColor();
                    break;
                case 7:
                    System.out.println("7. Search candies by color");
                    candyManager.searchByColor();
                    break;
                case 8:
                    System.out.println("8. Max candies price");
                    candyManager.maxPrice();
                    break;
                case 9:
                    System.out.println("9. Total candies price");
                    candyManager.totalPrice();
                    break;
                default:
                    break;
            }
        } while (choice != 0);
    }
}
