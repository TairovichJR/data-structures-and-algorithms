package arrays;

import java.util.*;

public class _Array {

    public static void main(String[] args) {

        int[] intArray = {20, 12, 50, 1};
        System.out.println(Arrays.toString(mergeSort(intArray, 0, intArray.length-1)));

    }

    public static int[] mergeSort(int[] input, int start, int end) {
        // break problem into smaller structurally identical problems
        int mid = (start + end) / 2;
        if (start < end) {
            mergeSort(input, start, mid);
            mergeSort(input, mid + 1, end);
            merge(input, start, mid, end);
        }
        return input;
    }

    public static int[] merge(int[] input, int start, int mid, int end){

        // merge solved pieces to get solution to original problem
         int i = 0, first = start, last = mid + 1;
         int[] tmp = new int[end - start + 1];
         while (first <= mid && last <= end) {
             if (input[first] < input[last]){
                 tmp[i++] =  input[first++];
             }else{
                 tmp[i++] =  input[last++];
             }
         }
         while (first <= mid) {
             tmp[i++] = input[first++];
         } while (last <= end) {
             tmp[i++] = input[last++];
         }
         i = 0;
         while (start <= end) {
             input[start++] = tmp[i++];
         }
         return input;
    }

}




