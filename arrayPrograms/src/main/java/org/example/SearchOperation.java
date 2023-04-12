package org.example;

//linear search in an unsorted array
public class SearchOperation {

    static void findElement(int arr[], int k, int n){
        for (int i=0; i<n; i++){
            if(arr[i] == k){
                System.out.println("Element ("+k+ ") found at "+ (i+1)+ " position");
                return;
            }
        }
        System.out.println("Element not found");

    }
    public static void main(String[] args) {
        int arr[] = { 12, 34, 10, 6, 40 };
        int n = arr.length;
        int k = 10;           //search element

        findElement(arr,k,n);


    }
}
