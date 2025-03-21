package Expr4;

abstract class Builder {
    protected Car car = new Car();

    public abstract void buildWheel();

    public abstract void buildOilBox();

    public abstract void buildBody();

    public Car getCar() {
        return car;
    }
}
