package animal;

public class Dog extends Animal implements AnimalAction {
    private String bite;

    public Dog() {
    }

    public Dog(String bite) {
        this.bite = bite;
    }

    public Dog(String name, int age, double weight, String bite) {
        super(name, age, weight);
        this.bite = bite;
    }

    public String getBite() {
        return bite;
    }

    public void setBite(String bite) {
        this.bite = bite;
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "Gâu Gâu";
    }
}
