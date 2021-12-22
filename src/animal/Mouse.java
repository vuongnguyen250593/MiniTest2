package animal;

public class Mouse extends Animal implements AnimalAction{
    private String troll;

    public Mouse() {
    }

    public Mouse(String troll) {
        this.troll = troll;
    }

    public Mouse(String name, int age, double weight, String troll) {
        super(name, age, weight);
        this.troll = troll;
    }

    public String getTroll() {
        return troll;
    }

    public void setTroll(String troll) {
        this.troll = troll;
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "Chít Chít";
    }
}
