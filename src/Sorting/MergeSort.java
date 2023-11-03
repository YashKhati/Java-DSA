package Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,11,7,12,15};
        int len  = arr.length;
        mergeSort(arr,0,len-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int low,int high){
        if(low < high){
            int mid = low + (high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] arr,int low,int mid,int high){

        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while (left <= mid && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while (right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low; i<= high;i++){
            arr[i] = temp.get(i-low);
        }
    }
}
