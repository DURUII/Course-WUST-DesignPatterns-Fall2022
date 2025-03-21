package Expr9;

public class NameObserver implements Observer{
    @Override
    public void response(Object o) {
        System.out.println("B: 我来看看是改名了吗？");
    }
}
