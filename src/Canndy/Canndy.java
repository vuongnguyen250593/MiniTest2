package Canndy;

public class Canndy {
    public static int value = 0;
    private int id;
    private String color;
    private String property;
    private int amount;
    private double price;

    public Canndy() {
    }

    public Canndy(int id, String color, String property, int amount, double price) {
        this.id = ++value;
        this.color = color;
        this.property = property;
        this.amount = amount;
        this.price = price;
    }

    public Canndy(String color, String property, int amount, double price) {
        this.color = color;
        this.property = property;
        this.amount = amount;
        this.price = price;
    }

    public static int getValue() {
        return value;
    }

    public static void setValue(int value) {
        Canndy.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Canndy{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", property='" + property + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
