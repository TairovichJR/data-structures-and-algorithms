package sorting_algorithms;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        /*
            Merge Sort uses divide and conquer algorithm
            This algorithm is NOT an in-place algorithm
            It is a logarithmic algorithm
            The time complexity is  Θnlogn Theta of n log n

            Stable algorithm
            Pros and Cons of Merge Sort
            Pros:
            1. Large sized list (millions)
            2. Suitable for linkedlist
            3. Stable algo, arrangement of duplicate elements is not disturbed

            Cons:
            1. Not an in-place algorithm, extra space
            2. It is slower for small sized lists compared to other sorts but much faster for large sizes
            3. Better use insertion sort for smaller sizes
            4. Recursive, which means it uses up stacks, the size of stack depends on the height of
            tracing tree of merge sort

         */

        int[] array = {40,2,6,-2,4,9};
        mergeSort(array, 0, array.length-1 );
        System.out.println(Arrays.toString(array));
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







