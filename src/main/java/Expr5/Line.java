package Expr5;

public class Line implements View{
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName()+"");
    }
}
