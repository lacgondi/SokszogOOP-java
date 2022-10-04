package hu.petrik.sokszog;

public class Haromszog extends Sokszog {
    private double b;
    private double c;

    public Haromszog(double a) {
        super(a);
    }

    public Haromszog(){
        super((Math.random()*10)+1);
        do {
            this.b = (Math.random()*10)+1;
            this.c = (Math.random()*10)+1;
        }while (getA()+b > c || getA()+c > b || b+c> getA());

    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
