package org.example;

import static org.example.ReverseArray.printArray;

/*  T.C is O(N) & A.S is O(N) */
public class LeftRotation {

    static void rotate(int arr[], int d, int n){
        int temp[] = new int[n];

        int k = 0;      //to keep track of current index

        //sorting d to n-1 elements
        for(int i=d; i < n; i++){
            temp[k] = arr[i];
            k++;
        }
        //sorting 0 to d-1 elements
        for(int i=0; i < d; i++){
            temp[k] = arr[i];
            k++;
        }

        //getting the original array after sorting
        for(int i=0; i < n; i++){
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int arr[] = {5,8,3,6,2,9};
        int n = arr.length;
        int d = 3;   //position from where we want to rotate array

        System.out.println("Array left rotation by " +d+ " position: ");
        rotate(arr, d,n);
        printArray(arr, n);

    }
}
