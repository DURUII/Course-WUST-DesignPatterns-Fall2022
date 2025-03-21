package Expr3;

public class KFCFactory implements Factory{
    @Override
    public Cola createCola() {
        System.out.println("KFC creates KFC Cola");
        return new KFCCola();
    }

    @Override
    public Hamburg createHamburg() {
        System.out.println("KFC creates KFC Hamburg");
        return new KFCHamburg();
    }
}
