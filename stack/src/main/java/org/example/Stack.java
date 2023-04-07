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
        }
        System.out.println("Inserted "+x);
        arr[++top] = x;
    }

    //to remove elements
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
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

    //peek the top element
    public int peek(){
        return arr[top];
    }

    //print stack
    public void printStack(){
        if (!isEmpty()){
            for (int i=0; i<=top; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }else {
            System.out.println("Array is empty!!");
        }

    }
    public static void main(String[] args) {

        Stack stack = new Stack(3);
        stack.push(5);
        stack.push(2);
        stack.push(1);

        System.out.println("Element at top of stack: "+stack.peek());

        stack.printStack();

        while (!stack.isEmpty()){
            int data = stack.pop();
            System.out.println("Removed from stack: "+data);
        }

        stack.printStack();

    }
}
