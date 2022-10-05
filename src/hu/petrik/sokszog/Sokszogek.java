package hu.petrik.sokszog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sokszogek {
    private List<Sokszog> sokszogList = new ArrayList<>();

    public Sokszogek() {
        int rand = (int)(Math.random()*4)+1;
        for (int i = 0; i < 100; i++) {
            switch (rand){
                case 1:
                    sokszogList.add(new Haromszog());
                    break;
                case 2:
                    sokszogList.add(new Paralelogramma());
                    break;
                case 3:
                    sokszogList.add(new Deltoid());
                    break;
                case 4:
                    sokszogList.add(new Teglalap());
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public String toString() {
        String temp="";
        for (int i = 0; i < sokszogList.size(); i++) {
            temp+=sokszogList.toString()+"\n";
        }
        return temp;
    }

    public double sumCirc(){
        double sum = 0;
        for (int i = 0; i < sokszogList.size(); i++) {
            sum+=sokszogList.get(i).getCircumference();
        }
        return sum;
    }

    public double sumArea(){
        double sum = 0;
        for (int i = 0; i < sokszogList.size(); i++) {
            sum+=sokszogList.get(i).getArea();
        }
        return sum;
    }

    public int maxArea(){
        int maxIndex = 0;
        double max = 0;
        for (int i = 0; i < sokszogList.size(); i++) {
            if (sokszogList.get(i).getArea()>max){
                max = sokszogList.get(i).getArea();
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
