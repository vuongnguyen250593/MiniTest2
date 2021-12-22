package human;

import java.util.Scanner;

public class MainHuman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HumanManager humanManager = new HumanManager();

        int choice;
        do {
            System.out.println("---------------");
            System.out.println("*******  Menu  *******");
            System.out.println("1. Display all Human");
            System.out.println("2. Display Male");
            System.out.println("3. Display Female");
            System.out.println("4. Display Human who have age less than 20");
            System.out.println("5. Add a Human");
            System.out.println("6. Delete by name");
            System.out.println("7. Update by name");
            System.out.println("8. Search by name");
            System.out.println("0. Exit");
            System.out.println("---------------");
            System.out.print("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Display all Human");
                    humanManager.displayAllHuman();
                    break;
                case 2:
                    System.out.println("2. Display Male");
                    humanManager.displayMale();
                    break;
                case 3:
                    System.out.println("3. Display Female");
                    humanManager.displayFemale();
                    break;
                case 4:
                    System.out.println("4. Display Human who have age less than 20");
                    humanManager.displayAgeLessThan20();
                    break;
                case 5:
                    System.out.println("5. Add a Human");
                    humanManager.addHuman();
                    break;
                case 6:
                    System.out.println("6. Delete by name");
                    humanManager.deleteByName();
                    break;
                case 7:
                    System.out.println("7. Update by name");
                    humanManager.updateByName();
                    break;
                case 8:
                    System.out.println("8. Search by name");
                    humanManager.searchByName();
                    break;
            }

        }while (choice != 0);
    }
}
