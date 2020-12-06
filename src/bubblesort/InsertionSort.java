package bubblesort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        /*
        Insertion Sort is an In-Place algorithm, so we dont have to create a new array
        Time complexity is O(n^2) quadratic due to nested loops
        Stable algorithm

        In Insertion Sort Algorithm, we are always going to assume that the array or list is divided into
        2 parts, sorted and unsorted. For that we are going to say that the very first element in the
        array will be in the sorted part.  e.g [6,2,8,0,1]. So the sorted part is [6] whereas anything
        after 6 is in the unsorted partition. The idea is the pick a value from an unsorted sublist and insert that
        into a sorted sublist by comparing each value. No need to compare till the rest if condition is met

         */

        int[] list = {5,4,10,1,6,2};
        System.out.println(Arrays.toString(insertionSort_differentApproach(list)));
    }


    public static int[] insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int temp = list[i];
            int j = i-1;

            while (j >= 0 && list[j] > temp){
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = temp;
        }
        return list;
    }

    public static int[] insertionSort_differentApproach(int[] list){
        for (int i = 1; i < list.length; i++){

            int temp = list[i];
            int j;
            for (j = i; j > 0 && list[j-1] > temp; j--){
                list[j] = list[j-1];
            }
            list[j] = temp;
        }
        return list;
    }

}

