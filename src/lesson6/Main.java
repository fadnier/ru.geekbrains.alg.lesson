package lesson6;

import java.lang.reflect.Array;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        MyTreeMap<Integer, String> map = new MyTreeMap<>();

        map.put(5,"five");
        map.put(1,"one");
        map.put(3,"three");
        map.put(2,"two");

        System.out.println(map);
        System.out.println(map.get(2));
        map.put(2,"ttt");
        System.out.println(map);

        map.deleteMin();
        System.out.println(map);*/
        Random random = new Random();
        float procent = 0;
        for (int i = 0; i <= 20; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();

            while (map.depth()<6) {
                int x = (int)random.nextInt(200) - 100;;
                map.put(x,x);
            }
            //System.out.println(map);
            System.out.println("Глубина "+map.depth());
            if(map.balance()) {
                procent++;
            }
        }
        System.out.println("Сбланасиравно - " + (int)procent +" из 20");
        System.out.println(procent / 20 * 100+"%");


    }
}
