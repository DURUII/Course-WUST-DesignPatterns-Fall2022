package Expr2;

public class Main {
    public static void main(String[] args) {
        IFactory factory = new LenovoFactory();
        ILaptop laptop=factory.build();
        laptop.info();
    }
}
