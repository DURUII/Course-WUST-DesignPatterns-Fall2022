package Expr1;

public class SingletonPattern {
    public static <T> void show(Resource<T> r) {
        T val = r.getParameter();
        System.out.println(val);
    }

    public static <T> void put(Resource<T> r, T val) {
        r.setParameter(val);
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Resource<String> ir = AppConfig.instance();
        Resource<String> ir2 = AppConfig.instance();
        show(ir);
        put(ir2, "customized config");
        show(ir);
    }
}
