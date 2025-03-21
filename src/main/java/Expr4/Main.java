package Expr4;

public class Main {
    public static void main(String[] args) {
        Director director=new Director();
        director.setBuilder(new BenZBuilder());
        System.out.println(director.buildCar());
    }
}
