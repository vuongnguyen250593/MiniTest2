package Person;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayAllStudent() {
        for (Student student: students) {
            System.out.println(student);
        }
    }

    public void addStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Math Score: ");
        double mathScore = scanner.nextDouble();
        System.out.print("Enter Physical Score: ");
        double physicalScore = scanner.nextDouble();
        System.out.print("Enter Chemistry Score: ");
        double chemistryScore = scanner.nextDouble();
        Student student = new Student(id,name,age,mathScore,physicalScore,chemistryScore);
        students.add(student);
        System.out.println("Add successfully");
    }

    public void updateById() {
        System.out.print("Enter ID that you want to update: ");
        int id = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                scanner.nextLine();
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();
                System.out.print("Enter Math Score: ");
                double mathScore = scanner.nextDouble();
                System.out.print("Enter Physical Score: ");
                double physicalScore = scanner.nextDouble();
                System.out.print("Enter Chemistry Score: ");
                double chemistryScore = scanner.nextDouble();
                Student newStudent = new Student(id,name,age,mathScore,physicalScore,chemistryScore);
                students.set(i,newStudent);
                break;
            }
        }
        System.out.println("The ID is not exist");
    }

    public void deleteById() {
        System.out.print("Enter ID that you want to delete: ");
        int id = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(students.get(i));
            }
        }
    }

    public void searchById() {
        System.out.print("Enter ID that you want to search: ");
        int id = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                System.out.println(students.get(i));
            }
        }
    }

    public void sortByAverageScore() {

    }

    public void maxScore() {
        double max = students.get(0).getMathScore() + students.get(0).getPhysicalScore() + students.get(0).getChemistryScore();
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMathScore() + students.get(i).getPhysicalScore() + students.get(i).getChemistryScore() > max) {
                max = students.get(i).getMathScore() + students.get(i).getPhysicalScore() + students.get(i).getChemistryScore();
                index = i;
            }
        }
        System.out.println(students.get(index));
    }
}
