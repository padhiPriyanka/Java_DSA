package org.example;

/*
T.c is O(n) */
public class ReverseArray {

    static void reverseArray(int arr[], int start, int end){
         int temp;

         while (start < end){
             temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }
    }
    static void printArray(int arr[],int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {5,8,3,6,2,9};
        System.out.println("Original Array: ");
        printArray(arr,arr.length);
        reverseArray(arr,0,arr.length - 1);
        System.out.println("Reversed array : ");
        printArray(arr,6);
    }
}
