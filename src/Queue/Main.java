package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Queue = fifo data structure first in first out (ex: a line of people)
        // a collection designed for holding elements prior to processing
        // linear data structure

        // add = enqueue, offer()
        // rmeove dequeue, poll()

        Queue<String> queue = new LinkedList<>();

        queue.offer("karen");
        queue.offer("chad");
        queue.offer("steve");
        queue.add("harold");

        queue.poll();
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("harold"));

        // where are queues useful?
        // keyboard buffer
        // printer queue
        // used in linkedlists, priority queues, breadth first search

    }
}
