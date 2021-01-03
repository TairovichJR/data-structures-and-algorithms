package codility;

import java.util.Arrays;

public class MaxMinArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{1,2,3,6,2})));

    }
    // solve([15,11,10,7,12]) = [15,7,12,10,11]
    public static int[]  solve (int[] arr){
       int[] temp = new int[arr.length];
        Arrays.sort(arr);
        for (int i = 0, j = arr.length - 1, k = 0; i <= j; ++i, --j) {
            if (i != j){
                temp[k] = arr[j];
                k++;
            }
            temp[k] = arr[i];
            k++;
        }
        return temp;
    }
}
