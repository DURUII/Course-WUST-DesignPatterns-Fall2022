package Expr4;

public class Director{
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Car buildCar(){
        builder.buildBody();
        builder.buildWheel();
        builder.buildOilBox();
        return builder.getCar();
    }
}
