package Expr4;

public class BenZBuilder extends Builder{
    @Override
    public void buildWheel() {
        car.setWheel("Benz Wheel");
    }

    @Override
    public void buildOilBox() {
        car.setOilBox("Benz OilBox");
    }

    @Override
    public void buildBody() {
        car.setBody("Benz Body");
    }
}
