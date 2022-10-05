package hu.petrik.sokszog;

import java.util.ArrayList;
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

}
