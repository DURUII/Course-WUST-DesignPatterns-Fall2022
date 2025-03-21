package Expr2;

public class LenovoFactory implements IFactory{
    @Override
    public ILaptop build(){
        System.out.println("Lenovo工厂生产Lenovo笔记本");
        return new LenovoLaptop();
    }
}
