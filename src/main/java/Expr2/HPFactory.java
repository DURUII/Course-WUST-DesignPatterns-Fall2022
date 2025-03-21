package Expr2;

public class HPFactory implements IFactory{
    @Override
    public ILaptop build(){
        System.out.println("HP工厂生产HP笔记本");
        return new HPLaptop();
    }
}
