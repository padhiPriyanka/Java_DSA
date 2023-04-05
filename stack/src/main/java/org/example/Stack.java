package org.example;

/* Implementing stack using arrays  */
public class Stack {

    private int arr[];
    private int top;
    private int capacity;

    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // to add elements
    public void push(int x){

        if(isFull()){
            System.out.println("Stack is Full!!");
            System.exit(1);
        }
        System.out.println("Inserted "+x);
        arr[++top] = x;
    }

    //to remove elements
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return arr[top--];
    }

    //check if the stack is full
    public boolean isFull(){
        return top == capacity - 1;
    }

    //check if the stack is empty
    public boolean isEmpty(){
        return top == - 1;
    }
    public static void main(String[] args) {

        Stack stack = new Stack(3);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(9);


    }
}
