package sorting_algorithms;

import java.util.Arrays;


public class SelectionSort {

    public static void main(String[] args) {
        /*
        Selection Sort is faster than Bubble Sort but still is not a fast algorithm
         because it uses nested loops to sort
         It is useful only for small data sets
         Time complexity is O(n^2) n squared time
         */

        int[] list = {1,5,-2,23,-9};
        System.out.println(Arrays.toString(list));
    }

    public static int[] selectionSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++){
            int minIndex = i; //initially assuming index of a minimum value is 0
            for(int j = i+1; j < nums.length; j++){
                if (nums[j] < nums[minIndex]){
                    //in case a smaller value is found, setting its new index to minValue
                    minIndex = j;
                }
            }
            //Swapping the elements
            if (minIndex != i){
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }

    public static int[] selectionSort_differentApproach(int[] nums){
        for (int unsortedIndex = nums.length-1; unsortedIndex > 0; unsortedIndex--){
            int largest = 0;
            for (int i = 1; i <= unsortedIndex; i++){
                if (nums[i] > nums[largest]){
                    largest = i;
                }
            }
            swap(nums, largest, unsortedIndex);
        }
        return nums;
    }

    //swapping utility
    private static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }







}
