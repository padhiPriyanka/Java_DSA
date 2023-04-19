package org.example.easyProblems;

import java.util.Arrays;
import static org.example.easyProblems.MoveToEndOfArray.print;

public class SearchElement {

    //To find 3 largest distinct element -T.C O(N)
    public static void findLargestDistinctElement(int arr[]){

        int i,first,second,third;
        if(arr.length < 3){
            System.out.println("Invalid input");
        }

        third = second = first = Integer.MIN_VALUE;

        for(i=0; i<arr.length; i++){

            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second){
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }

        System.out.println("Three largest distinct elements are:  "+first+ ", "+second+" ,"+third);
    }

    public static void   findSecondLargestElement(int arr[]){
        int i,first,second;
        second = first = Integer.MIN_VALUE;

        for(i=0; i<arr.length; i++) {

            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }
        }

        if(second == Integer.MIN_VALUE){
            System.out.println("There is no second largest element!");
        }else {
            System.out.println("Second largest element: "+second);
        }

    }
    public static void main(String[] args) {

        int arr[] = {10, 4, 3, 50, 23, 90};
        findLargestDistinctElement(arr);

        findSecondLargestElement(arr);

        //alternate way
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println("first: "+arr[n-1]+ " second: "+arr[n-2]+" third: "+arr[n-3]);
        print(arr,arr.length);

    }
}
