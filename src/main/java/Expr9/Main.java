package Expr9;

public class Main {
    public static void main(String[] args) {
        Product p = new Product("小米手机", 5999.99);

        p.addObserver((o) -> {
            o = (Product) o;
            System.out.println("A: 我来看看是降价了吗？");
        });

        p.addObserver((o)->{
            o = (Product) o;
            System.out.println("B: 我来看看是改名了吗？");
        });

        p.setName("小米12 Ultra");
        p.setPrice(49999.99);
    }
}
