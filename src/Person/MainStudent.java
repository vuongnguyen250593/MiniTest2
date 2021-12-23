package Person;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("---------------");
            System.out.println("*******  Menu  *******");
            System.out.println("1. Display all Student");
            System.out.println("2. Add a Student");
            System.out.println("3. Update by ID");
            System.out.println("4. Delete by ID");
            System.out.println("5. Search by ID");
            System.out.println("6. Sort by Average Score");
            System.out.println("7. Print max Score");
            System.out.println("0. Exit");
            System.out.println("---------------");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Display all Student");
                    studentManager.displayAllStudent();
                    break;
                case 2:
                    System.out.println("2. Add a Student");
                    studentManager.addStudent();
                    break;
                case 3:
                    System.out.println("3. Update by ID");
                    studentManager.updateById();
                    break;
                case 4:
                    System.out.println("4. Delete by ID");
                    studentManager.deleteById();
                    break;
                case 5:
                    System.out.println("5. Search by ID");
                    studentManager.searchById();
                    break;
                case 6:
                    System.out.println("6. Sort by Average Score");
                    studentManager.sortByAverageScore();
                    break;
                case 7:
                    System.out.println("7. Print max Score");
                    studentManager.maxScore();
                    break;
            }
        } while (choice != 0);
    }
}
