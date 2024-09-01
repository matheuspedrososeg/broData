package LinkedLIstVSArrayLIst;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // Linked List <-------------------------------------------------------------->
        startTime = System.nanoTime();

        arrayList.getLast();

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("Linked List Time: " + elapsedTime + "ns.");


        // ArrayList <-------------------------------------------------------------->

        startTime = System.nanoTime();

        arrayList.getLast();

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayLIst Time: " + elapsedTime + "ns.");
    }
}
