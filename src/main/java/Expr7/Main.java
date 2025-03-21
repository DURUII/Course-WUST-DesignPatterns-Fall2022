package Expr7;

public class Main {
    public static void main(String[] args) {

        Sheep xi=new Sheep();


        GreenBuff greenBuff = new GreenBuff();
        greenBuff.setComponent(xi);

        RedBuff redBuff = new RedBuff();
        redBuff.setComponent(greenBuff);

        YellowBuff yellowBuff=new YellowBuff();
        yellowBuff.setComponent(redBuff);

        yellowBuff.operation();

    }
}
