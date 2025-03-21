package Expr8;

public class Police {
    private Alarm alarm;
    private Camera camera;
    private Light light;
    private Sensor sensor;

    public Police() {
        alarm=new Alarm();
        camera=new Camera();
        light=new Light();
        sensor=new Sensor();
    }

    public void turnOnAll(){
        alarm.on();
        camera.on();
        light.on();
        sensor.on();
    }

    public void turnOffAll(){
        alarm.off();
        camera.off();
        light.off();
        sensor.off();
    }
}
