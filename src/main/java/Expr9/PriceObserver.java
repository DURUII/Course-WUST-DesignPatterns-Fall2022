package Expr9;

public class PriceObserver implements Observer{
    @Override
    public void response(Object o) {
        System.out.println("A: 我来看看是降价了吗？");
    }
}
