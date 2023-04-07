package org.example;
import  java.util.Stack;
/* Stack using Recursion
 */
public class StackUsingRecursion{

    static Stack<Integer> st = new Stack<>();

    static void insertAtBottom(int x){

        if(st.isEmpty()){
            st.push(x);
        }else {
            int n = st.peek();
            st.pop();
            insertAtBottom(x);

            st.push(n);
        }
    }
    static  void reverse(){
        if(st.size() > 0){
            int m = st.peek();
            st.pop();
            reverse();

            insertAtBottom(m);
        }
    }

    public static void main(String[] args) {

        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("Original stack: "+st);

        reverse();

        System.out.println("Reversed stack: "+st);
    }


}

