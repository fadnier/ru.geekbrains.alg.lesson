package lesson2;

import java.util.*;

public class Main {
    final static int COUNTARR = 1000000;

    public static void main(String[] args) {

//        String[] strArr ;
//        strArr = new String[5];
//        String[] strArr1 ={"A", "BBBB","CCC"};

//        int[] arr = new int[10];
//
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = i;
//        }
//
//
////
////        for (int i = 0; i <arr.length ; i++) {
////            if(arr[i] %2 == 0){
////                arr[i]+=10;
////            }
////        }
//
//        System.out.println(Arrays.toString(arr));

//        List<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.addAll(Arrays.asList(3, 6, 7, 2, 43, 56, 2, 2, 5));
//
//        System.out.println(list);
////        list.remove((Integer) 2);
////        list.removeIf(x -> x > 5);
////        list.removeAll(Arrays.asList(2));
//        System.out.println(list);


//        MyArrayList<Integer> mal = new MyArrayList<>();
//        mal.add(5);
//        mal.add(2);
//        mal.add(1);
//        mal.add(3);
//        System.out.println(mal);
//
//        mal.add(4, 9);
//        System.out.println(mal);

//        mal.remove(9);
//        System.out.println(mal);

//        System.out.println(mal.indexOf(9));


//       MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(5);
//        msal.add(9);
//        msal.add(2);
//        msal.add(4);
//        msal.add(1, 10);
//
//        System.out.println(msal);
//
//        System.out.println(msal.binaryFind(4));


        MyArrayList<Integer> myArrayList = new MyArrayList<>(COUNTARR);
        MyArrayList<Integer> myArrayList2 = new MyArrayList<>(COUNTARR);
        MyArrayList<Integer> myArrayList3 = new MyArrayList<>(COUNTARR);
        Random rand = new Random();
        for (int i = 0; i <COUNTARR; i++) {
            int randomSel = rand.nextInt(100);
            myArrayList.add(randomSel);
            myArrayList2.add(randomSel);
            myArrayList3.add(randomSel);
        }
//        System.out.println(mal);
//
////        mal.selectionSort();
////        mal.insertionSort();
////        mal.bubbleSort(Comparator.naturalOrder());
//        mal.bubbleSort(Comparator.reverseOrder());
//
//        System.out.println(mal);


//        MyArrayList<String> myArrayList = new MyArrayList<>();
//       myArrayList.add("aaa");
//        myArrayList.add("BBB");
//        myArrayList.add("bbbbbbb");
//        myArrayList.add("ccc");
//        myArrayList.add("AAAAA");
//        myArrayList.add("xxx");
//        myArrayList.add("YYYyy");

        //System.out.println(myArrayList);
        long a = System.currentTimeMillis();
        myArrayList.bubbleSort(Comparator.naturalOrder());
        long timeBubbleSort = System.currentTimeMillis() - a;
        a = System.currentTimeMillis();
        myArrayList2.insertionSort(Comparator.naturalOrder());
        long timeInsertionSort = System.currentTimeMillis() - a;
        a = System.currentTimeMillis();
        myArrayList3.selectionSort(Comparator.naturalOrder());
        long timeSelectionSort = System.currentTimeMillis() - a;
        System.out.printf("Сортировка массивов завершена:\nbubbleSort - %d сек.\ninsertionSort - %d сек.\nselectionSort - %d сек.",(int)timeBubbleSort/1000,(int)timeInsertionSort/1000,(int)timeSelectionSort/1000);
//        myArrayList.bubbleSort(Comparator.comparingInt(String::length));
//        myArrayList.bubbleSort(Comparator.comparingInt(String::length).reversed());
//        myArrayList.bubbleSort(Comparator.comparingISystem.out.println(myArrayList);nt(String::length).thenComparing(String::compareToIgnoreCase));
//        System.out.println(myArrayList);
    }

}
