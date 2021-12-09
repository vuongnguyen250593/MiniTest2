package com.company;

public class Product {
    private int code;
    private String name;
    private double price;
    private String type;
    private String currency;

    public Product() {
    }

    public Product(int code, String name, double price, String type, String currency) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.type = type;
        this.currency = currency;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Product {" +
                "code = " + code +
                ", name = '" + name + '\'' +
                ", price = " + price +
                ", type = '" + type + '\'' +
                ", currency = '" + currency + '\'' +
                '}';
    }
}
