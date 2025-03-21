package Expr2;


public class DellFactory implements IFactory {
    @Override
    public ILaptop build(){
        System.out.println("Dell工厂生产Dell笔记本");
        return new DellLaptop();
    }
}