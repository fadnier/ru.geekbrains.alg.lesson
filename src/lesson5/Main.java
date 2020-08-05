package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(fact(5));
//        System.out.println(recFact(5));

//        System.out.println(fibo(48));
//        System.out.println(recFibo(13));
//
//        System.out.println(triangleNum(5));
//        System.out.println(recTriangleNum(5));

        //System.out.println(multiply(3, 8));
        //System.out.println(recMultiply(3,8));

        ///Задание 1.
        System.out.println(recDegree(4,8));

        //Задание 2.
        List<Item> items = new ArrayList<>();

        items.add(new Item("Книга", 1, 600));
        items.add(new Item("Бинокль", 2, 5000));
        items.add(new Item("Аптечка", 4, 1500));
        items.add(new Item("Ноутбук", 2, 40000));
        items.add(new Item("Котелок", 1, 500));

        Backpack bp = new Backpack(4);
        bp.MakeAllSets(items);

        List<Item> solve = bp.GetBestSet();

        if(solve==null) {
            System.out.println("Нет решения");
        } else {
            System.out.println("Лучшее решение:");
            for (Item i: solve ) {
                System.out.println(i.name + " " + i.price + " " + i.weight);
            }
        }

    }

    public static int recDegree(int a, int b) {
        if(b == 1) {
            return a;
        }
        return recDegree(a,b-1) * a;
    }

    public static int fact(int n) {
        int value = 1;
        for (int i = 1; i <= n; i++) {
            value *= i;
        }
        return value;
    }

    public static int recFact(int n) {
        if (n <= 1) {
            return 1;
        }
        return recFact(n - 1) * n;
    }

    public static long fibo(int n) {
        long a = 1;
        long b = 1;
        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }

    public static long recFibo(int n) {
        if (n <= 2) {
            return 1;
        }
        return recFibo(n - 1) + recFibo(n - 2);
    }

    public static int triangleNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int recTriangleNum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n : " + n);
        }
        if (n == 1) {
            return 1;
        }
        return recTriangleNum(n - 1) + n;
    }

    public static int multiply(int a, int b) {
        int value = 0;
        for (int i = 0; i < b; i++) {
            value += a;
        }
        return value;
    }

    public static int recMultiply(int a, int b) {
        if (b == 1) {
            return a;
        }
        return recMultiply(a, b - 1) + a;
    }


}
