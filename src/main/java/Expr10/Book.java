package Expr10;

public class Book {
    String name;
    Double price;
    Discount discount;

    public Book(String name, Double price, Discount discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getDiscountedPrice() {
        return discount.compute(price);
    }
}

