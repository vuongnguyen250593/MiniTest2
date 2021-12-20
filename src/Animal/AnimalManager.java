package Animal;

import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class AnimalManager {
    ArrayList<Animal> animals = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public AnimalManager() {
    }

    public AnimalManager(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animals);
    }

    public void deleteByName(String name) {
        animals.remove(name);

    }

    public void editByName(String name) {

    }

    public void searchByName(String name) {

    }

    public void displayAll() {

    }

    public void displayDog() {

    }

    public void displayByWeight() {

    }

    public void createAnimal(Scanner scanner, AnimalManager animalManager) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        Animal animal = new Animal(name,age,weight);
        animalManager.addAnimal(animal);
    }
}
