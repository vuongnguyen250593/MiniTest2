package Laptop;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLaptop {
    public static void main(String[] args) {
        LaptopManager laptopManager = new LaptopManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("---------------");
            System.out.println("*******  Menu  *******");
            System.out.println("1. Add a Laptop by ID");
            System.out.println("2. Update a Laptop by ID");
            System.out.println("3. Delete a Laptop by ID");
            System.out.println("4. Display all Laptop");
            System.out.println("5. Search by Brand");
            System.out.println("6. Search by Price");
            System.out.println("7. ");
            System.out.println("8. Search by Color");
            System.out.println("0. Exit");
            System.out.println("---------------");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("---------------");
            switch (choice) {
                case 1:
                    System.out.println("1. Add a Laptop");
                    Laptop laptop = laptopManager.createLaptop();
                    laptopManager.addLaptop(laptop);
                    break;
                case 2:
                    System.out.println("2. Update a Laptop by ID");
                    System.out.print("Enter ID that you want to update: ");
                    int updateId = scanner.nextInt();
                    System.out.println(laptopManager.updateLaptop(updateId));
                    break;
                case 3:
                    System.out.println("3. Delete a Laptop by ID");
                    int deleteId;
                    boolean check = false;
                    do {
                        System.out.print("Enter ID that you want to delete: ");
                        deleteId = scanner.nextInt();
                        try {
                            System.out.println("Delete successfully");
                            check = true;
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                            System.err.println("The ID is not existence or error. Please re-enter!");
                            check = false;
                        }
                    } while (check != true);
                    System.out.println(laptopManager.deleteLaptop(deleteId));
                    break;
                case 4:
                    System.out.println("4. Display all Laptop");
                    laptopManager.displayAllLaptop();
                    break;
                case 5:
                    System.out.println("5. Search by Brand");
                    scanner.nextLine();
                    System.out.print("Enter Brand that you want to search: ");
                    String searchBrand = scanner.nextLine();
                    scanner.nextLine();
                    ArrayList<Laptop> laptopArrayList1 = laptopManager.searchByBrand(searchBrand);
                    laptopArrayList1.forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("6. Search by Price");
                    System.out.println("1. <= 5.000.000");
                    System.out.println("2. 5.000.000 - 10.000.000");
                    System.out.println("3. >= 10.000.000");
                    System.out.print("Choice price that you want to search: ");
                    int choicePrice = scanner.nextInt();
                    ArrayList<Laptop> laptopArrayList2 = laptopManager.searchByPrice(choicePrice);
                    laptopArrayList2.forEach(System.out::println);
                    break;
                case 7:
                    System.out.println("7. ");
                    break;
                case 8:
                    System.out.println("8. Search by Color");
                    System.out.print("Enter color that you want to search: ");
                    String searchColor = scanner.nextLine();
                    scanner.nextLine();
                    ArrayList<Laptop> laptopArrayList3 = laptopManager.searchByColor(searchColor);
                    laptopArrayList3.forEach(System.out::println);
                    break;
            }
        } while (choice != 0);
    }

}
