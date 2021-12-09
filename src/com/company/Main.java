package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product number: ");
        int number = scanner.nextInt();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Code: ");
        int code = scanner.nextInt();
        System.out.print("Enter Type: ");
        String type = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Currency: ");
        String currency = scanner.nextLine();
        scanner.nextLine();


        Product[] product = new Product[number];
        for (int i = 0; i <= product.length; i++) {
            product[i] = new Product(code,name,price,type,currency);
        }
        for (Product product1: product) {
            System.out.println(product1);
        }
    }
}
