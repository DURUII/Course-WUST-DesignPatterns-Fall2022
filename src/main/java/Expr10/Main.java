package Expr10;

public class Main {
    public static void main(String[] args) {
        Discount CS = price -> price * 0.7;
        Discount En = price -> price * 0.6;

        Book b1 = new Book("具体数学", 100.0, CS);
        Book b2 = new Book("大学英语语法", 288.9, En);

        System.out.println(b1.getDiscountedPrice());
        System.out.println(b2.getDiscountedPrice());
    }
}
