package com.simplilearn.search;
import java.util.Arrays;

public class ExpSearch {

public static  void main(String[] args){

    int[] arr = {6,12,18,24,32};
    int length= arr.length;
    int value = 18;
    int outcome = exponentialSearch(arr,length,value);

    if(outcome<0){

       System.out.println( "Element is not present in the array");

    }else {

        System.out.println( "Element is  present in the array at index :"+outcome);
    }

        }

        public static int exponentialSearch(int[] arr ,int length, int value ){

        	//check if the element available at first index
        if(arr[0]==value){
            return 0;
            }
        int i=1;//find out the range by repeated doubling
        while(i<length && arr[i]<=value){

            i=i*2;
        }
        //call binary search
        return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
        }

}