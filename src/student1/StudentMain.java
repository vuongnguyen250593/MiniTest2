package student1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("------------");
            System.out.println("******  Menu  ******");
            System.out.println("1. Add a Student");
            System.out.println("2. Update a Student by ID");
            System.out.println("3. Delete a Student by ID");
            System.out.println("4. Search a Student by ID");
            System.out.println("5. Sort AverageScore");
            System.out.println("6. Max Score");
            System.out.println("7. Write to file");
            System.out.println("8. Read from a file");
            System.out.println("0. Exit");
            System.out.println("---------------");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("---------------");
            switch (choice) {
                case 1:
                    System.out.println("1. Add a Student");
                    Student student = studentManager.createStudent();
                    studentManager.addStudent(student);
                    break;
                case 2:
                    System.out.println("2. Update a Student by ID");
                    System.out.print("Enter ID that you want to Update: ");
                    int idUpdate = scanner.nextInt();
                    System.out.println(studentManager.updateStudent(idUpdate));
                    break;
                case 3:
                    System.out.println("3. Delete a Student by ID");
                    System.out.print("Enter ID that you want to Delete: ");
                    int idDelete = scanner.nextInt();
                    System.out.println(studentManager.deleteStudent(idDelete));
                    break;
                case 4:
                    System.out.println("4. Search a Student by ID");
                    System.out.print("Enter ID that you want to Search: ");
                    int idSearch = scanner.nextInt();
                    System.out.println(studentManager.searchById(idSearch));
                    break;
                case 5:
                    System.out.println("5. Sort AverageScore");
                    studentManager.sortAverageScore();
                    break;
                case 6:
                    System.out.println("6. Max Score");
                    System.out.println(studentManager.maxScore());
                    break;
                case 7:
                    System.out.println("7. Write to file");
                    break;
                case 8:
                    System.out.println("8. Read from a file");
                    break;
            }
        } while (choice != 0);
    }
}
