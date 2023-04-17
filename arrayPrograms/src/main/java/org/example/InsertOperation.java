package org.example;

import static org.example.ReverseArray.printArray;

//Insert element in an unsorted array
public class InsertOperation {


    //Insert element in an unsorted array
    static int insertAtEnd(int arr[],int d, int n){         //T.C O(1)

           if(n >= arr.length){
               return  n;
           }
        arr[n] = d;
        return (n+1);
    }
    //Insert element at any position  in an unsorted array
    static int insertAtAnyPosition(int arr[],int key, int pos,int x){         //T.C O(N)

       for (int i = x-1; i>=pos; i--)
             arr[i+1] = arr[i];
       arr[pos] = key;

       return x+1;
    }
    //Insert element in a sorted array
    static int insertInSortedArray(int arr[],int d, int n){         //T.C O(N)

        if(n >= arr.length){
            return  n;
        }
        int i;
        for (i= (n-1); (i>=0 && arr[i] > d); i--)
             arr[i+1] = arr[i];
        arr[i+1] = d;
        return (n+1);
    }
    public static void print(int arr[],int n){

        for(int i=0; i< n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] arr = new int[8];
         arr[0] = 5;
         arr[1] = 8;
         arr[2] = 3;
         arr[3] = 9;
        int k = 11;
        int n = 4;
        System.out.print("Before Insertion: ");
        print(arr,n);

        n =  insertAtEnd(arr,k,n);

        System.out.print("After Insertion in an Unsorted array: ");
        print(arr,n);

        int pos = 2;
        int l = insertAtAnyPosition(arr,k,pos,4);
        System.out.print("After Insertion at desired position in an Unsorted array: ");
        print(arr,l);

        int array[] = new int[5];
        array[0] = 3;
        array[1] = 5;
        array[2] = 8;
        array[3] = 9;
        int m = 4;

        System.out.print("Sorted arrray: ");
        print(array,m);

        n = insertInSortedArray(array,k,m);
        System.out.print("After Insertion in a sorted array: ");
        print(array,n);


    }
}
