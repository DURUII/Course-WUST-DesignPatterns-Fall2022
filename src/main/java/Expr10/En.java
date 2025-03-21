package Expr10;

public class En implements Discount{
    @Override
    public double compute(Double price) {
        return price * 0.6
                ;
    }
}
