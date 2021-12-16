package minitest2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student number: ");
        int size = scanner.nextInt();
        Student[] students = new Student[size];
        HumanManager humanManager = new HumanManager(students);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Display all Student");
            System.out.println("2. Display add a Student");
            System.out.println("3. Display search a Student");
            System.out.println("4. Display delete a Student");
            System.out.println("5. Display edit by id");
            System.out.println("6. Display sort by average score");
            System.out.println("7. Display total average score");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            System.out.println("----------");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    humanManager.displayAllStudent();
                    break;
                case 2:
                    Student student = createStudent(Scanner);
                    humanManager.displayAddStudent(student);
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
            }
        } while (choice != 0);
    }

    public static Student createStudent(Scanner scanner) {
        System.out.print("Enter Name:");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Average: ");
        double averageScore = scanner.nextDouble();
    }
}
