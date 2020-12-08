package bubblesort;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {
        int[] nums = {2, 2,2,2,2,22};
        quickSort(nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] a, int lb, int ub){
        if (lb < ub){
            int loc = partition(a, lb, ub);
            quickSort(a, lb, loc);
            quickSort(a, loc+1, ub);
        }
    }

    public static int partition(int[] input, int start, int end){
       int pivot = input[start];
       int i = start;
       int j = end;

       while (i < j){
           while (i < j && input[--j] >= pivot);
           if (i < j){
               input[i] = input[j];
           }

           while (i < j && input[++i] <= pivot);
           if (i < j){
               input[j] = input[i];
           }
       }
       input[j] = pivot;
       return j;
    }

}
