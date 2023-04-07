package org.example;

import static java.lang.System.exit;

/*
Implementing stack using Linked list
 */
public class StackUsingLL {
    private class Node{
        int data;
        Node link;
    }
    Node top;
    public StackUsingLL() {
        this.top = null;
    }
    //to add data in stack
    public void push(int x){

        Node nodeObj = new Node();

        if(nodeObj == null ){
            System.out.println("Stack is full!!");
            return;
        }
        nodeObj.data = x;
        nodeObj.link = top;
        top = nodeObj;

    }
    //to remove data from stack
    public void pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        top = top.link;

    }

    public int peek(){
        if(!isEmpty()){
            return top.data;
        }else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void printStack(){
        if(top == null){
            System.out.println("Stack is empty");
            exit(1);
        }else {
            Node nodeObj = top;
            while (nodeObj != null){
                System.out.print(nodeObj.data);

                nodeObj = nodeObj.link;
                if(nodeObj != null)
                    System.out.print(" -> ");

            }
            System.out.println();
        }
    }
    public boolean isEmpty(){
        return top == null;
    }

    public static void main(String[] args) {

        StackUsingLL obj = new StackUsingLL();

        obj.push(5);
        obj.push(8);
        obj.push(3);
        obj.push(10);
        obj.push(13);


        obj.printStack();

        System.out.println("Top element : "+obj.peek());

        obj.pop();
        obj.pop();

        obj.printStack();
        System.out.println("Top element : "+obj.peek());

    }
}
