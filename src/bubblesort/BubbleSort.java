package bubblesort;


import java.util.HashMap;

public class BubbleSort {

    public static void main(String[] args) {

        int[] intArray = {20,35,-22,1,9,0,5,35,12,-90,5,30};


    }

    // more optimized
    public static  int[] bubbleSort_one(int[] nums){
        for (int lastUnsortedIndex = nums.length-1; lastUnsortedIndex > 0; lastUnsortedIndex-- ){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if (nums[i] > nums[i+1]){
                    swap(nums, i , i+1);
                }
            }
        }
        return nums;
    }

    //the basic one
    public static  int[] bubbleSort_two(int[] nums){
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length-1; j++){
                if(nums[j] > nums[j+1]){
                    int larger =  nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = larger;
                }
            }
        }
        return nums;
    }

    public static int[] bubbleSort_three(int[] nums){
        boolean isSorted;
        for(int i = 0; i < nums.length; i++){
            isSorted = true;
            for(int j = 1; j < nums.length-i; j++ ){
                if (nums[j] < nums[j-1]){
                    swap(nums, j, j - 1);
                    isSorted = false;
                }
                if (isSorted){
                    return nums;
                }
            }
        }
        return nums;
    }

    private static void swap(int[] array, int i, int j){
        if (i != j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
