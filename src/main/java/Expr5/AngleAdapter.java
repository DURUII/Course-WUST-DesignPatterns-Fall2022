package Expr5;

public class AngleAdapter extends Angle{
    private Angle angle;

    public AngleAdapter(Angle angle) {
        this.angle = angle;
    }

    public void draw(double radian) {
        angle.drawAngle(radian*180);
    }
}
