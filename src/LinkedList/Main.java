package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
//        linkedList.add("A");
//        linkedList.add("B");
//        linkedList.add("C");
//        linkedList.add("D");
//        linkedList.add("F");
        // linkedList.pop();

        // mimic a queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
//        linkedList.poll();

        linkedList.add(4, "E"); // will sub the node at index 4
        linkedList.remove("E");

        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.indexOf("F"));

        linkedList.addFirst("0");
        linkedList.addLast("G");

        // LinkedList =  Nodes are in 2 parts (data + address)
        //                        Nodes are in non-consecutive memory locations
        //                        Elements are linked using pointers

        //    advantages?
        //    1. Dynamic Data Structure (allocates needed memory while running)
        //    2. Insertion and Deletion of Nodes is easy. O(1)
        //    3. No/Low memory waste

        //    disadvantages?
        //    1. Greater memory usage (additional pointer)
        //    2. No random access of elements (no index [i])
        //    3. Accessing/searching elements is more time consuming. O(n)

        //    uses?
        //    1. implement Stacks/Queues
        //    2. GPS navigation
        //    3. music playlist
    }
}