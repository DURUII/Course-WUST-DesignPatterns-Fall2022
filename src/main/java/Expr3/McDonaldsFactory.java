package Expr3;

public class McDonaldsFactory implements Factory{
    @Override
    public Cola createCola() {
        System.out.println("McDonalds creates McDonalds Cola");
        return new McDonaldsCola();
    }

    @Override
    public Hamburg createHamburg() {
        System.out.println("McDonalds creates McDonalds Hamburg");
        return new McDonaldsHamburg();
    }
}
