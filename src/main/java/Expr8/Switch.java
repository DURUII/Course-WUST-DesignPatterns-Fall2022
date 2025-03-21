package Expr8;

abstract class Switch {
    boolean status = false;

    void on() {
        status = true;
        System.out.println("打开 " + getClass().getSimpleName());
    }

    void off() {
        status = false;
        System.out.println("关闭 " + getClass().getSimpleName());
    }
}
