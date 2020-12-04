package bubblesort;

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
        System.out.println(Arrays.toString(selectionSort(list)));
    }

    public static int[] selectionSort(int[] list){
        for (int i = 0; i < list.length-1; i++){
            int minIndex = i; //initially assuming index of a minimum value is 0
            for(int j = i+1; j < list.length; j++){
                if (list[j] < list[minIndex]){
                    //in case a smaller value is found, setting its new index to minValue
                    minIndex = j;
                }
            }
            //Swapping the elements
            if (minIndex != i){
                int temp = list[minIndex];
                list[minIndex] = list[i];
                list[i] = temp;
            }
        }
        return list;
    }

}
