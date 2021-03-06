package sorting_algorithms;

import java.util.Arrays;

public class MergeSortDifferent {

    public static void main(String[] args) {

        int[] intArray = {20, 12, 50, 1};
        mergeSort(intArray, 0, intArray.length);
        System.out.println(Arrays.toString(intArray));
    }

    public static void mergeSort(int[] input, int start, int end){
        if (end - start < 2){
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid-1] <= input[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int k = 0;

        int[] temp = new int[end -start];
        while (i < mid && j < end){
            temp[k++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input, i, input, start + k, mid - i);
        System.arraycopy(temp, 0, input, start, k);
    }

}
