package Animal;

public class Cat extends Animal implements AnimalAction{
    private String hunt;

    public Cat() {
    }

    public Cat(String hunt) {
        this.hunt = hunt;
    }

    public Cat(String name, int age, double weight, String hunt) {
        super(name, age, weight);
        this.hunt = hunt;
    }

    public String getHunt() {
        return hunt;
    }

    public void setHunt(String hunt) {
        this.hunt = hunt;
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "Meo Meo";
    }
}
