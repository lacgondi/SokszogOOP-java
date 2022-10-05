package hu.petrik.sokszog;

public class Deltoid extends Sokszog {

    private double b;
    private double e;
    private double f;

    public Deltoid(double a,double b, double e, double f) {
        super(a);
        this.b = b;
        this.e = e;
        this.f = f;
    }

    public Deltoid() {
        super(Math.random()*10+1);
        this.b = Math.random()*10+1;
        this.e = Math.random()*10+1;
        this.f = Math.random()*10+1;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    @Override
    public double getArea() {
        return this.e*this.f/2;
    }

    @Override
    public double getCircumference() {
        return 2*(getA()+b);
    }
}
