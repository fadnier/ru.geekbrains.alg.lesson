package lesson3;

import java.nio.charset.Charset;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(stack.pop());
//        }

//        Expression e = new Expression("(4-6)+[{67+45} * {a / b}]");
//        System.out.println(e.checkBracket());


//        MyQueue<Integer> queue = new MyQueue<>();
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//
//        System.out.println(queue);
//
//        for (int i = 0; i < 3 ; i++) {
//            System.out.println(queue.remove());
//        }


//        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();
//
//        mpq.insert(5);
//        mpq.insert(1);
//        mpq.insert(7);
//        mpq.insert(4);
//        mpq.insert(2);
//
//        System.out.println(mpq);
//        for (int i = 0; i < 5 ; i++) {
//            System.out.println(mpq.remove());
//        }

        ///Zadanie 1
        String dz1 = "Hello world";
        System.out.println(dz1);
        dz1 = reverseText(dz1);
        System.out.println(dz1);

        ///Zadanie 2
        MyDeque<Integer> deq = new MyDeque<>();
        deq.insertRight(1);
        deq.insertRight(2);
        deq.insertRight(3);
        System.out.println(deq);
        deq.insertLeft(1);
        deq.insertLeft(2);
        deq.insertLeft(3);
        System.out.println(deq);
        deq.removeLeft();
        deq.removeRight();
        System.out.println(deq);

        ///Zadanie 3
        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<Integer>(Comparator.reverseOrder());
        mpq.insert(5);
        mpq.insert(1);
        mpq.insert(7);
        mpq.insert(4);
        mpq.insert(2);
        System.out.println(mpq);

        ///Zadanie 4
        MyStack<Integer> stack = new MyStack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
    }

    public static String reverseText(String string) {
        MyStack<String> stack = new MyStack<>(string.length());

        for (int i = 0; i < string.length(); i++) {
            stack.push(string.split("")[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <string.length() ; i++) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
