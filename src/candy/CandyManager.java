package candy;

import java.util.ArrayList;
import java.util.Scanner;

public class CandyManager {
    ArrayList<Candy> candies = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayAllCandy() {
        for (Candy candy: candies) {
            System.out.println(candy);
        }
    }

    public void addCandy() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Color: ");
        String color = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Property: ");
        String property = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Amount: ");
        int amount = scanner.nextInt();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        Candy candy = new Candy(id, color, property, amount, price);
        candies.add(candy);
    }

    public void deleteCandyById() {
        System.out.print("Enter ID that you to delete: ");
        int id = scanner.nextInt();
        for (int i = 0; i < candies.size(); i++) {
            if (candies.get(i).getId() == id) {
                candies.remove(candies.get(i));
            }
        }
        for (Candy candy: candies) {
            System.out.println(candy);
        }
    }

    public void editCandy() {
        System.out.print("Enter ID you want to edit: ");
        int id = scanner.nextInt();
        for (int i = 0; i < candies.size(); i++) {
            if (candies.get(i).getId() == id) {
                scanner.nextLine();
                System.out.print("Enter Color: ");
                String color = scanner.nextLine();
                scanner.nextLine();
                System.out.print("Enter Property: ");
                String property = scanner.nextLine();
                scanner.nextLine();
                System.out.print("Enter Amount: ");
                int amount = scanner.nextInt();
                System.out.print("Enter Price: ");
                double price = scanner.nextDouble();
                Candy newCandy = new Candy(id,color,property,amount,price);
                candies.set(i,newCandy);
            } else {
                System.out.println("The ID is not exist");
            }
        }
        for (Candy candy: candies) {
            System.out.println(candy);
        }
    }

    public void searchById() {
        System.out.print("Enter ID that you want to search: ");
        int id = scanner.nextInt();
        for (int i = 0; i < candies.size(); i++) {
            if (candies.get(i).getId() == id) {
                System.out.println(candies.get(i));
            }
        }
    }

    public void deleteByColor() {
        System.out.print("Enter Color that you to delete: ");
        String color = scanner.nextLine();
        scanner.nextLine();
        for (int i = 0; i < candies.size(); i++) {
            if (candies.get(i).getColor().equals(color)) {
                candies.remove(candies.get(i));
            }
        }
        for (Candy candy: candies) {
            System.out.println(candy);
        }
    }

    public void searchByColor() {
        boolean check;
        String color;
        do {
            System.out.print("Enter Color that you want to search: ");
            color = scanner.nextLine();
            check = false;
            try {
                System.out.println("hiện thị ra kết quả");
                check = true;
            } catch (Exception e) {
                System.err.println("nhập sai dữ liệu");
                check = false;
            }
        } while (check != true);


        scanner.nextLine();
        for (int i = 0; i < candies.size(); i++) {
            if (candies.get(i).getColor().equals(color)) {
                System.out.println(candies.get(i));
            }
        }
    }

    public void maxPrice() {
        double maxPrice = candies.get(0).getPrice();
        for (int i = 0; i < candies.size(); i++) {
            if (candies.get(i).getPrice() > maxPrice) {
                maxPrice = candies.get(i).getPrice();
            }
        }
        System.out.println("Max Price = " + maxPrice);
    }

    public void totalPrice() {
        double total = 0;
        for (int i = 0; i < candies.size(); i++) {
            System.out.println("candy " + i + ": " + candies.get(i).getPrice() * candies.get(i).getAmount() + " $ ");
            total = total + candies.get(i).getPrice() * candies.get(i).getAmount();
        }
        System.out.println("Total price = " + total);
    }
}
