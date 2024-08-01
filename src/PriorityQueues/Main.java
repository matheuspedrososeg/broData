package PriorityQueues;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // priority queue = a fifo data strucutre that serves elements
        // with the highest priority first
        // before elements with lower priority

        Queue<String> queue = new PriorityQueue<>();

        //Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        // reverse order to reverse the order duh, will be in descending order

        queue.add("B");
        queue.add("C");
        queue.add("A");
        queue.add("F");
        queue.add("D");


        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
