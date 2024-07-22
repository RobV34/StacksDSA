package Stacks;

public class Main {
    public static void main(String[] args) {
        // Testing StackArrays
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        System.out.println("StackArrays Pop: " + stackArrays.pop()); // Output: 3
        System.out.println("StackArrays Peek: " + stackArrays.peek()); // Output: 2
        System.out.println("StackArrays isPalindrome (racecar): " + stackArrays.isPalindrome("racecar")); // Output: true
        stackArrays.deleteStack();

        // Testing StackLinkedList
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        System.out.println("StackLinkedList Pop: " + stackLinkedList.pop()); // Output: 3
        System.out.println("StackLinkedList Peek: " + stackLinkedList.peek()); // Output: 2
        System.out.println("StackLinkedList isPalindrome (racecar): " + stackLinkedList.isPalindrome("racecar")); // Output: true
        stackLinkedList.deleteStack();
    }
}

