package com.lifecycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Samosa() {
    }

    @Override
    public String toString() {
        return "Samosa [price=" + price + "]";
    }


    public void init(){
        System.out.println("this is init method");
    }
    public void destroy(){
        System.out.println("this is destroy method");
    }
}
