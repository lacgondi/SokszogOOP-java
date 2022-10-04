package hu.petrik.sokszog;

public abstract class Sokszog {
    private double a;

    public Sokszog(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public abstract double getArea();
    public abstract double getCircumference();

    @Override
    public String toString() {
        return String.format("K = %f - T = %f",getCircumference(), getArea());
    }
}
