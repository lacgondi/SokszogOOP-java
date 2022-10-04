package hu.petrik.sokszog;

public class Main {
    public static void main(String[] args) {
        Sokszog s1 = new Sokszog(2);
        System.out.println(s1);

        Teglalap t1 = new Teglalap(2,3);
        System.out.println(t1.getCircumference());
        System.out.println(t1.getArea());
        System.out.println(t1);

        Haromszog h1 = new Haromszog(2,3,4);
        Haromszog h2 = new Haromszog();
        System.out.println(h2.isEditable());
        System.out.println(h1.isEditable());
        System.out.println(h1.getCircumference());
        System.out.println(h1.getArea());
        System.out.println(h1);
    }
}
