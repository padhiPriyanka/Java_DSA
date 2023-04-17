package org.example;

//linear search in an array
public class SearchOperation {

    //linear search in an unsorted array - T.C O(N)
    static void findElement(int arr[], int k, int n){
        for (int i=0; i<n; i++){
            if(arr[i] == k){
                System.out.println("Element ("+k+ ") found at index "+ (i));
                return;
            }
        }
        System.out.println("Element not found");
    }

    //linear search in a sorted array using binary search method- T.C O(log(n))
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

    public static void main(String[] args) {
        int arr[] = { 12, 34, 10, 6, 40 };
        int n = arr.length;
        int k = 10;           //search element
        findElement(arr,k,n);

        int array[] = {6,10,12,34,40,52};

        System.out.println("Element ("+k+ ") found at index "+binarySearch(array,k,0,array.length-1));

    }
}
