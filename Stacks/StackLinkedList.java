package Stacks;

import java.util.LinkedList;

public class StackLinkedList {
    private LinkedList<Integer> stack;

    public StackLinkedList() {
        stack = new LinkedList<>();
    }

    // Push method
    public void push(int element) {
        stack.addFirst(element);
    }

    // Pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.removeFirst();
    }

    // Peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.getFirst();
    }

    // Delete stack method
    public void deleteStack() {
        stack.clear();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Check if a word is a palindrome
    public boolean isPalindrome(String word) {
        StackLinkedList stack = new StackLinkedList();
        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : word.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

