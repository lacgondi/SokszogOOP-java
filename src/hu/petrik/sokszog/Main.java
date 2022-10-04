package hu.petrik.sokszog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
        List<Haromszog> haromszogList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            haromszogList.add(new Haromszog());
            System.out.println(haromszogList.get(i));
        }
    }
}
