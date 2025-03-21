package Expr9;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double price;
    List<Observer> observers = new ArrayList<Observer>();

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    void notifyObservers() {
        for (Observer o : observers) {
            o.response(this);
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
}
