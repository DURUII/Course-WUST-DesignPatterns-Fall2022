package Expr4;


public class BMWBuilder extends Builder {

    @Override
    public void buildWheel() {
        car.setWheel("BMW Wheel");
    }

    @Override
    public void buildOilBox() {
        car.setOilBox("BMW OilBox");
    }

    @Override
    public void buildBody() {
        car.setBody("BMW Body");
    }
}
