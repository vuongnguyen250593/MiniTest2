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
            System.out.println("4. Search a animal by name");
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
                    System.out.println("Animal types: ");
                    System.out.println("1. Dog");
                    System.out.println("2. Cat");
                    System.out.println("3. Mouse");
                    System.out.print("Enter your choice: ");
                    int choice1 = scanner.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.println("1. Dog");
                            animalManager.addAnimal();
                            break;
                        case 2:
                            System.out.println("2. Cat");
                            animalManager.addAnimal();
                            break;
                        case 3:
                            System.out.println("3. Mouse");
                            animalManager.addAnimal();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("2. Delete a animal by name");
                    animalManager.deleteByName();
                    break;
                case 3:
                    System.out.println("3. Edit a animal by name");
                    break;
                case 4:
                    System.out.println("4. Search a animal by name");
                    animalManager.searchByName();
                    break;
                case 5:
                    System.out.println("5. Display all animal");
                    animalManager.displayAll();
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
