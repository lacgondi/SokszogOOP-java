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

    @Override
    public double getCircumference(){
        return (getA()+b)*2;
    }

    @Override
    public double getArea(){
        return getA()*2+b*2;
    }

    @Override
    public String toString() {
        return String.format("Téglalap: a = %f - b = %f - K = %f - T = %f", getA(), b, getCircumference(), getArea());
    }
}
