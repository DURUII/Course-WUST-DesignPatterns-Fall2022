package Expr2;

public class AcerFactory implements IFactory {
    @Override
    public ILaptop build(){
        System.out.println("Acer工厂生产Acer笔记本");
        return new AcerLaptop();
    }
}
