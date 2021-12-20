package Animal;

import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalManager animalManager = new AnimalManager();
        int choice;
        do {
            System.out.println("---------------");
            System.out.println("******* Menu *******");
            System.out.println("1. Add a animal");
            System.out.println("2. Delete a animal by name");
            System.out.println("3. Edit a animal by name");
            System.out.println("4. Display a animal by name");
            System.out.println("5. Display all animal");
            System.out.println("6. Display all Dog in animal");
            System.out.println("7. Dispaly animals with weight");
            System.out.println("0. Exit");
            System.out.println("---------------");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("---------------");
            switch (choice) {
                case 1:
                    System.out.println("1. Add a animal");
                    animalManager.createAnimal(scanner, animalManager);
                    break;
                case 2:
                    System.out.println("2. Delete a animal by name");
                    break;
                case 3:
                    System.out.println("3. Edit a animal by name");
                    break;
                case 4:
                    System.out.println("4. Display a animal by name");
                    break;
                case 5:
                    System.out.println("5. Display all animal");
                    break;
                case 6:
                    System.out.println("6. Display all Dog in animal");
                    break;
                case 7:
                    System.out.println("7. Dispaly animals with weight");
                    break;
                default:
                    break;
            }
        } while (choice != 0);
    }
}
