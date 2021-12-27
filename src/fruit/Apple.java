package fruit;

public class Apple extends Fruit{
    public Apple() {
    }

    public Apple(String name, double weight, String taste, String color, double price) {
        super(name, weight, taste, color, price);
    }

    public Apple(String weight, String taste, String color, double price) {
        super(weight, taste, color, price);
    }
}
