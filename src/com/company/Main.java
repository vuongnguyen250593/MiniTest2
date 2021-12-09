package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product number: ");
        int number = scanner.nextInt();
        System.out.println("---------------");

        Product[] product = new Product[number];
        for (int i = 0; i < product.length; i++) {
            System.out.print("Enter Code " + (i + 1) +": ");
            int code = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Name " + (i + 1) +": ");
            String name = scanner.nextLine();
            System.out.print("Enter Price " + (i + 1) +": ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter Type " + (i + 1) +": ");
            String type = scanner.nextLine();
            System.out.print("Enter Currency " + (i + 1) +": ");
            String currency = scanner.nextLine();
            System.out.println("---------------");

            product[i] = new Product(code, name, price, type, currency);
        }

        for (Product productInfo : product) {
            System.out.println(productInfo);
        }
    }
}
