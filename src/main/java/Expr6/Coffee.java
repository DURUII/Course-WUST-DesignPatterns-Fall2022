package Expr6;

public abstract class Coffee {
    Taste taste;

    void display(){
        taste.display();
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }
}
