package fruit;

public class Fruit {
    private String name;
    private double weight;
    private String taste;
    private String color;
    private double price;

    public Fruit() {
    }

    public Fruit(String name, double weight, String taste, String color, double price) {
        this.name = name;
        this.weight = weight;
        this.taste = taste;
        this.color = color;
        this.price = price;
    }

    public Fruit(String weight, String taste, String color, double price) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
