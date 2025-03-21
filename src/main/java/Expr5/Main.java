package Expr5;

public class Main {
    public static void main(String[] args) {
        new Line().draw();
        new Circle().draw();

        AngleAdapter angleAdapter=new AngleAdapter(new Angle());
        angleAdapter.draw(1.0*1/3);
    }
}
