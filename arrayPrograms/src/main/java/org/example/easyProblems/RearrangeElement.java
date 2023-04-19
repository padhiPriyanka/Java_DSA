package org.example.easyProblems;

//To rearrange array such that even positioned are greater than odd positioned elements

import java.util.Arrays;

public class RearrangeElement {


    //T.C O(N)
    static void rearrange(int[] arr, int n){

        for(int i= 1; i< n; i++){

            if(i % 2 == 0){
                if(arr[i] > arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }else {
                if(arr[i] < arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }

        System.out.print("Even positioned are greater than odd position in the array: ");
        for (int i=0; i< n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

    }

    public static void assign(int[] arr,int n){

        Arrays.sort(arr);   //sort the array

        int[] val = new int[n];
        int p=0, q= n-1;

        for(int i=0; i<n; i++){
            if((i+1) % 2 == 0){
                val[i] = arr[q--];
            }
            else
                val[i] = arr[p++];
        }

        System.out.print("Even positioned are greater than odd position in the array: ");
        for (int i=0; i< n;i++){
            System.out.print(val[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] A = { 1, 3, 2, 2, 5 };
        int n = A.length;
        rearrange(A,n);

        //alternate way
        assign(A,n);

    }

}
