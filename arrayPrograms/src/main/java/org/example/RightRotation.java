package org.example;

import static org.example.ReverseArray.printArray;

/*  T.C is O(N) & A.S is O(1) */
public class RightRotation {

    static void rotateRight(int arr[], int d, int n){
        int temp[] = new int[n];

        int k = 0;      //to keep track of current index

        //sorting d to n-1 elements
        for(int i=d+1; i < n; i++){
            temp[k] = arr[i];
            k++;
        }
        //sorting 0 to d-1 elements
        for(int i=0; i <= d; i++){
            temp[k] = arr[i];
            k++;
        }

        //getting the original array after sorting
        for(int i=0; i < n; i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int n = arr.length;
        int d = 2;   //position from where we want to rotate array

        System.out.println("Original Array:");
        printArray(arr,n);
        System.out.println("Array right rotation by " +d+ " position: ");
        rotateRight(arr, d,n);
        printArray(arr, n);
    }

}
