package human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanManager {
    ArrayList<Human> humans = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayAllHuman() {
        for (Human human: humans) {
            System.out.println(human);
        }
    }

    public void displayMale() {
        System.out.println("Enter gender that you want to display");
        String gender = "Male";
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getGender().equals(gender)) {
                System.out.println(humans.get(i));
            }
        }
    }

    public void displayFemale() {
        System.out.println("Enter gender that you want to display");
        String gender = "Female";
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getGender().equals(gender)) {
                System.out.println(humans.get(i));
            }
        }
    }

    public void displayAgeLessThan20() {
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getAge() < 20) {
                System.out.println(humans.get(i));
            }
        }
    }

    public void addHuman() {
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
        Human human = new Human(name, age, gender, address);
        humans.add(human);
    }

    public void deleteByName() {
        System.out.println("Enter name that you want to delete: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getName().equals(name)) {
                humans.remove(humans.get(i));
            }
        }
        for (Human human: humans) {
            System.out.println(human);
        }
    }

    public void updateByName() {
        System.out.println("Enter name that you want to update: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getName().equals(name)) {
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();
                System.out.print("Enter Gender: ");
                String gender = scanner.nextLine();
                scanner.nextLine();
                System.out.print("Enter Address: ");
                String address = scanner.nextLine();
                scanner.nextLine();
                Human newHuman = new Human(name, age, gender, address);
                humans.set(i,newHuman);
            }
        }
        for (Human human: humans) {
            System.out.println(human);
        }
    }

    public void searchByName() {
        System.out.println("Enter name that you want to delete: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getName().equals(name)) {
                System.out.println(humans.get(i));
            }
        }
    }
}
