package Human1;

import Laptop.Laptop;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Student createStudent() {
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Average Score: ");
        double averageScore = scanner.nextDouble();
        return new Student(name, age, gender, address, averageScore);
    }

    public void addStuden(Student student) {
        students.add(student);
    }

    public Student deleteByName(String name) {
        Student student = null;
        for (Student s: students) {
            if (s.getName().equalsIgnoreCase(name)) {
                student = s;
            }
        }
        students.remove(student);
        return student;
    }

    public Student updateStudentByName(String name) {
        Student student = null;
        for (Student s: students) {
            if (s.getName().equalsIgnoreCase(name)) {
                student = s;
            }
        }
        if (student != null) {
            int index = students.indexOf(student);
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.print("Enter Gender: ");
            String gender = scanner.nextLine();
            student.setGender(gender);
            scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            student.setAddress(address);
            scanner.nextLine();
            System.out.print("Enter Average Score: ");
            double averageScore = scanner.nextDouble();
            student.setAverageScore(averageScore);
            students.set(index,student);
        }
        return student;
    }

    public void displayAllStudent() {
        for (Student s: students) {
            System.out.println(s);
        }
    }

    public ArrayList<Student> displayAverageScoreGreaterThan75() {
        ArrayList<Student> student = new ArrayList<>();
        for (Student s: students) {
            if (s.getAverageScore() >= 7.5) {
                student.add(s);
            }
        }
        return student;
    }

    public static void writeToFile(String path, ArrayList<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Student> readDataFromFile(String path) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (ArrayList<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
