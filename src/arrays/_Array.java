package arrays;

import java.util.*;

public class _Array {

    public static void main(String[] args) {

        int[] intArray = {20, 12, 50, 1};

       //insertion sort
        for (int i = 1; i < intArray.length; i++){

            int temp = intArray[i]; //storing 12
            int j;
            for( j = i-1; j >= 0 && intArray[j] > temp; j--){
                intArray[j+1] = intArray[j];
            }
            intArray[j+1] = temp;
        }

        System.out.println(Arrays.toString(intArray));
    }

}