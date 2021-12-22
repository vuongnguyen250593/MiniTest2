package animal;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalManager {
    ArrayList<Animal> animals = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public AnimalManager() {
    }

    public AnimalManager(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        Animal animal = new Animal(name,age,weight);
        animals.add(animal);
    }

    public void deleteByName() {
        System.out.print("Search: ");
        String search = scanner.nextLine();
        scanner.nextLine();
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i).getName().equals(search)) {
                animals.remove(animals.get(i));
                System.out.println(animals);
            }
        }
    }

    public void editByName(String name) {

    }

    public void searchByName() {
        System.out.print("Search: ");
        String search = scanner.nextLine();
        scanner.nextLine();
        for (Animal animal:animals) {
            if (animal.getName().equals(search)) {
                System.out.println(animal);
            }

        }
    }

    public void displayAll() {
        System.out.println(animals);
    }

    public void displayDog() {

    }

    public void displayByWeight() {
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        for (Animal animal: animals) {

        }
    }

}
