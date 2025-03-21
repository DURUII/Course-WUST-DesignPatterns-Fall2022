package Expr5;

public class Rectangle implements View{
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName()+"");
    }
}
