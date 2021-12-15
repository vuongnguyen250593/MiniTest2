package student;

import java.util.Scanner;

public class mainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of student you want to create: ");
        int size = scanner.nextInt();
        Student[] students = new Student[size];
        StudentManage studentManage = new StudentManage(students);

        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Display All");
            System.out.println("2. Display Max Score");
            System.out.println("3. Display Min Score");
            System.out.println("4. Display Gender");
            System.out.println("5. Search by Name");
            System.out.println("6. Add a Student");
            System.out.println("7. Delete a Student");
            System.out.println("7. Sort by Score");
            System.out.println("0. Exit");
            System.out.print("Enter you choice: ");
            choice = scanner.nextInt();
            System.out.println("--------------------");
            switch (choice) {
                case 1:
                    studentManage.displayAllStudent();
                    break;
                case 2:
                    studentManage.displayMaxScore();
                    break;
                case 3:
                    studentManage.displayMinScore();
                    break;
                case 4:
                    int choice1;
                    do {
                        System.out.println("Menu");
                        System.out.println("1. Male");
                        System.out.println("2. Female");
                        System.out.println("0. Exit");
                        System.out.print("Enter you choice: ");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                studentManage.displayByGender("Male");
                                break;
                            case 2:
                                studentManage.displayByGender("Female");
                                break;
                        }
                    } while (choice1 != 0);
                case 5:
                    System.out.print("Enter Name you want to find: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    studentManage.searchByName(name);
                    break;
                case 6:
                    Student student = createStudent(scanner);
                    studentManage.addStudent(student);
                    break;
                case 7:
                    System.out.print("Enter Name you want to find: ");
                    scanner.nextLine();
                    String nameDelete = scanner.nextLine();
                    studentManage.deleteStudent(nameDelete);
                case 8:
                    studentManage.sortByAverageScore();
            }
        } while (choice != 0);
    }

    public static Student createStudent(Scanner scanner) {
        System.out.print("Enter name: ");
        scanner.nextLine();
        String name1 = scanner.nextLine();
        System.out.print("Enter age:");
        int age = scanner.nextInt();
        System.out.print("Enter gender: ");
        scanner.nextLine();
        String gender = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter average score: ");
        double score = scanner.nextDouble();
        return new Student(name1, age, gender, address, score);
    }
}
