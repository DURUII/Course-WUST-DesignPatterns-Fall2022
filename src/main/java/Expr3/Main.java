package Expr3;

public class Main {
    public static void main(String[] args) {
        Factory factory=new KFCFactory();
        Cola cola=factory.createCola();
        cola.bubble();
        Hamburg hamburg=factory.createHamburg();
        hamburg.steam();
    }
}
