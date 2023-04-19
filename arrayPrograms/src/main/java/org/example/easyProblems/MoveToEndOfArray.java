package org.example.easyProblems;

// move 0 value to end of array
public class MoveToEndOfArray {

    static void push0ToEnd(int[] arr){
        int count = 0;

        for (int i=0; i< arr.length; i++){
            if(arr[i] != 0)
                arr[count++] = arr[i];
        }

        while (count < arr.length){
            arr[count++] = 0;
        }
    }

    public static void print(int[] arr,int n){

        for(int i=0; i< n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr ={1, 2, 0, 0, 0, 3, 6};
        push0ToEnd(arr);
        print(arr, arr.length);

    }
}
