package hu.petrik.sokszog;

public class Teglalap extends Sokszog {
    private double b;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Teglalap(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getCircumference(){
        return (getA()+b)*2;
    }

    public double getArea(){
        return getA()*2+b*2;
    }
}
