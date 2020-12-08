package arrays;

import java.util.*;

public class _Array {

    public static void main(String[] args) {

        int[] intArray = {20, 12, 50, 1};

        mergeSort(intArray, 0 , intArray.length-1);
        System.out.println(Arrays.toString(intArray));

    }


    public static void mergeSort(int[] nums, int start, int end){

        int mid = (start + end)/2;

        if (start < end){
            mergeSort(nums, start, mid);
            mergeSort(nums, mid+1, end);
            merge(nums, start, mid, end);
        }
    }

    public static void merge(int[]nums, int start, int mid, int end){

        int k = 0; int first = start; int last = mid+1;

        int[] temp = new int[end-start+1];

        while (first <= mid && last <= end){
            if (nums[first] < nums[last]){
                temp[k++] = nums[first++];
            }else{
                temp[k++] = nums[last++];
            }
        }
        while (first<= mid){
            temp[k++] = nums[first++];
        }
        while (last<= end){
            temp[k++] = nums[last++];
        }
        k = 0;
        while (start <= end){
            nums[start++] = temp[k++];
        }
    }






    public static void shellSort(int[] nums){

        for (int gap = nums.length/2; gap > 0; gap/= 2){
            for (int i = gap; i < nums.length; i++){
                for (int j = i -gap; j>=0; j = j -gap){
                    if (nums[j+gap] > nums[j]){
                        break;
                    }else{
                        int temp = nums[j+gap];
                        nums[j+gap] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
    }




    public static void selectionSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++){
            int minInd = i;
            for (int j = i+1; j < nums.length; j++){
                if (nums[j] < nums[minInd]){
                    minInd = j;
                }
            }
            if (minInd != i){
                int temp = nums[minInd];
                nums[minInd] = nums[i];
                nums[i] = temp;
            }
        }

    }

    public static void insertionSort(int nums[]){
        for (int i = 1; i < nums.length; i++){
            int temp = nums[i];
            int j = i-1;

            while (j>=0 && nums[j] > temp){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;
        }
    }




}




