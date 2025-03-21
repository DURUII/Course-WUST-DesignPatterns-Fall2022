package Expr1;

public class AppConfig implements Resource<String> {
    private static AppConfig appConfig = new AppConfig();
    private String parameter = "default config";

    private AppConfig() {
        System.out.println("AppConfig()");
    }

    public static AppConfig instance() {
        return appConfig;
    }

    @Override
    public synchronized String getParameter() {
        return parameter;
    }

    @Override
    public synchronized void setParameter(String parameter) {
        this.parameter = parameter;
    }
}
