package bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        /*
        Bubble sort is an in-place algorithm, so it does not use extra memory
        In worst case, the time complexity is O(n^2) n squared
        The reason is, the outer loop will be executed n-1 times (if you have 7 elements in the array, so 6 times)
        And there is also the inner loop which will be executed n-1 times, so time complexity is (n-1)*(n-1) -> O(n^2) constants dropped
        */

        int[] intArray = {20, 35, 50, 1};
        bubbleSort_three(intArray);
        System.out.println(Arrays.toString(intArray));

    }
    //the basic one
    public static int[] bubbleSort_basic(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int larger = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = larger;
                }
            }
        }
        return nums;
    }

    // a little bit better
    public static int[] bubbleSort_better(int[] nums) {
        for (int lastUnsortedIndex = nums.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                }
            }
        }
        return nums;
    }

    //The more optimized bubble sort in case the array was sorted already, no need to traverse
    public static int[] bubbleSort_three(int[] nums) {
        boolean isSorted;
        for (int i = 0; i < nums.length; i++) {
            isSorted = true;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
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
