package Expr7;

public class YellowBuff extends Buff{
    @Override
    public void operation() {
        System.out.println("趟着水跑的");
        component.operation();
    }
}
