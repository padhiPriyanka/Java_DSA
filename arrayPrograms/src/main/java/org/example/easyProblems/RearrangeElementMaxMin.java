package org.example.easyProblems;

import java.util.Arrays;

public class RearrangeElementMaxMin {

    static void rearrange(int[] arr,int n){
        int[] temp = arr.clone();

        int min = 0, max = n-1;

        for (int i=0; i<n; i++){
            if (i % 2 == 0)
                arr[i] = temp[max--];
            else
                arr[i] = temp[min++];
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        System.out.println("Original array: "+ Arrays.toString(arr));

        rearrange(arr,n);
        System.out.println("Modified array: "+ Arrays.toString(arr));

    }
}
