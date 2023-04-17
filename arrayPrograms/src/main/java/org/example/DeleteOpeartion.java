package org.example;

import static org.example.InsertOperation.print;

public class DeleteOpeartion {

    static int binarySearch(int arr[],int k, int low, int high){
        if(high < low){
            return -1;
        }
        int mid = (low + high)/2;

        if(k == arr[mid]){
            return mid;
        }
        if(k > arr[mid]){
            return binarySearch(arr,k,mid+1,high);  //search right half
        }
        return binarySearch(arr,k,low,mid-1);       //search left half
    }

    static int findElement(int arr[], int k){
        for (int i=0; i<arr.length; i++){
            if(arr[i] == k){
                //System.out.println("Element ("+k+ ") found at index "+ (i));
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }
    //delete in a sorted array - T.C O(N)
    static int delete(int arr[],int k){

        int pos = binarySearch(arr,k,0,arr.length-1);

        if(pos == -1){
            System.out.println("Element not found");
            return arr.length;
        }
        int i;
        for (i= pos; i< arr.length-1; i++)
                arr[i] = arr[i+1];
        return arr.length-1;

    }
    //delete element from an unsorted array - T.C O(N)
    static int deleteElement(int arr[], int k){
        int pos = findElement(arr,k);

        if(pos == -1){
            System.out.println("Element not found");
            return arr.length;
        }
        int i;
        for (i= pos; i< arr.length-1; i++)
            arr[i] = arr[i+1];
        return arr.length-1;
    }

    public static void main(String[] args) {

        int array[] = {6,10,12,34,40,52};
        int k = 34;           //delete element

        System.out.print("Sorted Array Before deletion: ");
        print(array,array.length);

       int  n = delete(array,k);
        System.out.print("Sorted Array after deletion: ");
       print(array,n);

        int arr[] = { 12, 34, 10, 6, 40 };
        System.out.print("Unsorted Array Before deletion: ");
        print(arr,arr.length);

        int  m = deleteElement(arr,k);
        System.out.print("Unsorted Array after deletion: ");
        print(arr,m);

    }

}
