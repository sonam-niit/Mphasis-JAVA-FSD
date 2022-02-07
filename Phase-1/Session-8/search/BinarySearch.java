package com.simplilearn.search;
public class BinarySearch {

    public static  void main(String[] args){


        int[] arr = {3,6,9,12,15};
        int key = 12;
        int arrlength = arr.length;
        binarySearch(arr,0,key,arrlength);
    }

public static void binarySearch(int[] arr, int lb, int key, int ub){

        int midValue = (lb+ub)/2;
        while(lb<=ub){

            if(arr[midValue]<key){

                lb = midValue + 1;
            } else if(arr[midValue]==key){
                System.out.println("Element is found at index :"+midValue);
                break;
            }
            else {

                ub=midValue-1;
            }
            midValue = (lb+ub)/2;
        }
            if(lb>ub){

                System.out.println("Element is not found");
            }

}

}