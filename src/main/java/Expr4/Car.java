package Expr4;

public class Car {
    String wheel;
    String oilBox;
    String body;

    @Override
    public String toString() {
        return "Car{" +
                "wheel='" + wheel + '\'' +
                ", oilBox='" + oilBox + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getOilBox() {
        return oilBox;
    }

    public void setOilBox(String oilBox) {
        this.oilBox = oilBox;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
