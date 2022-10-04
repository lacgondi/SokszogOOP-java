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

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getCircumference() {
        return 0;
    }
}
