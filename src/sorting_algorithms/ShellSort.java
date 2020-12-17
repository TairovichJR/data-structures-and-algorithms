package sorting_algorithms;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {


        /*
            Shell Sort is an In-Place algorithm
            Difficult to nail down the time complexity because it will depend on the gap.
            Worst case: O(n^2) but it can perform much better than that

            Does not require as much shifting as insertion sort, so it usually performs better

            Unstable algorithm

            In Shell Sorting we have something called 'gap', which is used to compare and swap distant elements
            There is multiple ways of calculating the gap. In each iteration we are reducing the gap until it become
            1 and when it becomes 1, we are using the Insertion Sort. A common method of calculating the gap is N/2 where N is the array.

         */
        int[] list = {30,15,2,8,-1,22};
        System.out.println(Arrays.toString(shellSort_differentApproach(list)));
    }

    public static int[] shellSort(int[] nums){

        //In this case we are calculating the gap by N/2

        //this outer is for decrementing the iteration by N/2 each time, so first 4 times, then 2, then 1, and that is it. We stop at 1
        for(int gap = nums.length/2; gap>=1; gap= gap/2){
            //This iteration is for moving elements by one within the distance of gap.
            for(int i = gap; i < nums.length; i++){
                //This iteration is for comparing elements within that gap and at a certain point doing the insertion sort when j>=0 is true
                for (int j = i - gap; j >= 0; j = j - gap ){
                    if (nums[j+gap] > nums[j]){
                        break;
                    }else {
                        swap(nums, j + gap, j);
                    }
                }
            }
        }
        return nums;
    }

    public static int[] shellSort_differentApproach(int[] nums){

        // With this approach we are not swapping elements
        for (int gap = nums.length/2; gap > 0; gap /= 2 ){
            for (int i = gap; i < nums.length; i++){
                //This part is following insertion sort
                int temp = nums[i];
                int j = i;
                while (j>= gap && nums[j-gap] > temp){
                    nums[j] = nums[j-gap];
                    j = j - gap;
                }
                nums[j] = temp;
            }
        }
        return nums;
    }

    private static void swap(int[] list, int index1, int index2) {
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

}
