package Human1;

import Person.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("---------------");
            System.out.println("*******  Menu  *******");
            System.out.println("1. Add a Student");
            System.out.println("2. Delete a Student by Name");
            System.out.println("3. Update a Student by Name");
            System.out.println("4. Display all Student");
            System.out.println("5. Display all Student with Average Score is greater than 7,5");
            System.out.println("6. Display all Student with: Name - Average Score - Rating");
            System.out.println("7. Write to File");
            System.out.println("8. Read from a File");
            System.out.println("0. Exit");
            System.out.println("---------------");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Add a Student");
                    Student student = studentManager.createStudent();
                    studentManager.addStudent(student);
                    break;
                case 2:
                    System.out.println("2. Delete a Student by Name");
                    System.out.print("Enter name that you want to delete: ");
                    String deleteName = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println(studentManager.deleteByName(deleteName));
                    break;
                case 3:
                    System.out.println("3. Update a Student by Name");
                    System.out.print("Enter name that you want to update: ");
                    String updateName = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println(studentManager.updateByName(updateName));
                    break;
                case 4:
                    System.out.println("4. Display all Student");
                    studentManager.displayAllStudent();
                    break;
                case 5:
                    System.out.println("5. Display all Student with Average Score is greater than 7,5");
                    ArrayList<Student> students = studentManager.displayAverageScoreGreaterThan75();
                    students.forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("6. Display all Student with: Name - Average Score - Rating");
                    break;
                case 7:
                    System.out.println("7. Write to File");
                    break;
                case 8:
                    System.out.println("8. Read from a File");
                    break;
            }
        } while (choice != 0);
    }
}
