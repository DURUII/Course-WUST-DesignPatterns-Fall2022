package Expr6;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new JorumCoffee();
        coffee.setTaste(new Lemon());
        coffee.display();
    }
}
