package Expr5;

public class Circle implements View{

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName()+"");
    }
}
