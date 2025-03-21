package Expr7;

public class RedBuff extends Buff{

    @Override
    public void operation() {
        System.out.println("加上保护罩的");
        component.operation();
    }
}
