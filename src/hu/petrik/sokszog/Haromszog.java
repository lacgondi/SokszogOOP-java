package hu.petrik.sokszog;

public class Haromszog extends Sokszog {
    private double b;
    private double c;

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    public Haromszog() {
        super((Math.random() * 5) + 1);
        this.b = (Math.random() * 5) + 1;
        this.c = (Math.random() * 5) + 1;

        while (!isEditable()){
            setA((Math.random() * 5) + 1);
            this.b = (Math.random() * 5) + 1;
            this.c = (Math.random() * 5) + 1;
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        if(!this.isEditable()){
            throw new IllegalArgumentException("A megadott 3szög nem szerkeszthető");
        }
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        if(!this.isEditable()){
            throw new IllegalArgumentException("A megadott 3szög nem szerkeszthető");
        }
    }

    @Override
    public void setA(double a){
        super.setA(a);
        if(!this.isEditable()){
            //throw new IllegalArgumentException("A megadott 3szög nem szerkeszthető");
        }
    }

    public double getCircumference() {
        return this.getA() + this.b + this.c;
    }

    private double getS() {
        return getCircumference() / 2;
    }

    public double getArea() {
        return Math.sqrt(getS() * (getS() - this.getA()) * (getS() - b) * (getS() - c));
    }

    public boolean isEditable() {
        if ((this.getA() + b) <= c || this.getA() + c <= b || b + c <= this.getA()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("Háromszög: a = %f - b = %f - c = %f - K = %f - T = %f", getA(), b, c, getCircumference(), getArea());
    }
}
