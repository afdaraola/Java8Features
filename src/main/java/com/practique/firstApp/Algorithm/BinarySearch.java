package com.practique.firstApp.Algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int [] ars = {1,2,4,5,7,9,12};
        int size = 7;
        int key =12;

        System.out.println(bSearch(ars,size,key));
    }

    public static int bSearch(int[] arr, int size, int key){

        int low = 0;
        int high = size -1;
        int mid = 0;

        while(low<=high){
            mid = low +(high -low)/2;

            if(arr[mid] == key){
                return mid;
            }else if (arr[mid] < key){
                low = mid+1;
            } else {
                high = mid -1;
            }

        }
        return -1;
    }


}
