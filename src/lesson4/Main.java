package lesson4;

import java.net.Socket;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        MyLinkedList<String> mll = new MyLinkedList<>();
//
//        mll.insertFirst("Katia");
//        mll.insertFirst("Petia");
//        mll.insertFirst("Maria");
//
//        System.out.println(mll);
//
//        mll.insertLast("Bob");
//        System.out.println(mll);



//        System.out.println(mll.deleteFirst());
//        System.out.println(mll);
//
//        System.out.println(mll.getFirst());

//        mll.insert(1, "Sasha");
//        System.out.println(mll);
//
//        System.out.println(mll.delete("Bob"));
//        System.out.println(mll);
//
//
//        for (String s : mll) {
//            System.out.println(s);
//        }

        //Задание 1: для сравнение поведения использовал реализованый  ListIterator у List
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("D");
        mll.insertFirst("C");
        mll.insertFirst("B");
        mll.insertFirst("A");

        System.out.println(mll);
        ListIterator listIterator = mll.listIterator();
        while (listIterator.hasNext()) {
            String element = (String) listIterator.next();
            listIterator.set(element + "+");
        }
        //listIterator.next();  //проверка на NoSuchElementException;

        System.out.print("Измененный MyLinkedList в обратном порядке: ");
        while (listIterator.hasPrevious()) {
            String element = (String) listIterator.previous();
            System.out.print(element + " ");
        }
        //listIterator.previous(); //проверка на NoSuchElementException;

        System.out.println();
        //Проверяем как должен работать стандарный лист итератор
        List<String> arrayList = Arrays.asList("A", "B", "C", "D");
        System.out.println(arrayList);
        ListIterator<String> listIterator2 = arrayList.listIterator();
        while (listIterator2.hasNext()) {
            String element = listIterator2.next();
            listIterator2.set(element + "+");
        }

        System.out.print("Измененный arrayList в обратном порядке: ");
        while (listIterator2.hasPrevious()) {
            String element = listIterator2.previous();
            System.out.print(element + " ");
        }

        //Задание 2: Очередь - первым извлекается элемент, который был добавлен первым
        /*
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
        linkedQueue.insert("Katia");
        linkedQueue.insert("Petia");
        linkedQueue.insert("Maria");

        System.out.println(linkedQueue);

        System.out.println(linkedQueue.remove());
        System.out.println(linkedQueue.remove());
        System.out.println(linkedQueue.remove());
        */
    }
}
