package hu.petrik.sokszog;

public class Paralelogramma extends Sokszog {
    private double b;

    private double alpha;
    public Paralelogramma(double a, double b, double alpha) {
        super(a);
        this.b = b;
        this.alpha = alpha;
    }

    public Paralelogramma(){
        super((Math.random()*10)+1);
        b = (Math.random()*10)+1;
        alpha = (Math.random()*179)+1;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    private double toRadian(){
        return alpha * Math.PI /180;
    }

    @Override
    public double getArea() {
        return Math.abs(Math.sin(toRadian()));
    }

    @Override
    public double getCircumference() {
        return 0;
    }
}
