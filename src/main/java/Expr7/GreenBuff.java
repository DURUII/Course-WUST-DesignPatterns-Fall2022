package Expr7;

public class GreenBuff extends Buff{
    @Override
    public void operation() {
        System.out.println("奔跑速度的");
        component.operation();
    }
}
