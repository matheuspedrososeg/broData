package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // lifo data structure = last in first out
        // stores object into a sort of vertical tower
        // ()push to add to the top
        // pop() to renove from the top

        Stack<String> stack = new Stack<>();


        stack.push("minecraft");
        stack.push("skyrim");
        stack.push("doom");
        stack.push("ffxv");
        stack.push("borderlands");
        String myfavgame = stack.pop();
        // System.out.println(myfavgame);

        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("doom"));

        // uses of stack
        //1 undo redo features in text editors
        // 2 moving back and forward through browse history
        // 3 backtracking algorithms (maze, file directories)
        // 4 calling functions (call stack)


    }
}
