package Stacks;

public class StackArrays {
    private int[] stack;
    private int top;
    private int capacity;

    public StackArrays(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // Push method
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = element;
    }

    // Pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    // Peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // Delete stack method
    public void deleteStack() {
        stack = null;
        top = -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if a word is a palindrome
    public boolean isPalindrome(String word) {
        StackArrays stack = new StackArrays(word.length());
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


