package sorting_algorithms;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {

        /*
        Not an in-place algorithm
        Unlike other sorting algos, we are not comparing elements.
        basically we are counting the elements having distinct key values
        Time complexity O(n)

        How does it work?

        Let's say we have this array given A = [5,2,1,3,5,2,2,0,8,6,7] and we need to sort it using Counting Sort
        1. First we need to identify the range of elements. What is the largest element in the array? In our case, it is 8
        2. We are going to create one array called C with the size 8+1, that will be used to store how many times each element from the A
        appear.
        3. That is when we start the iterating A, the first element is 5. We will increment index 5 from C. Next element from A is 2.
        We will increment index 2 to 1. Next element from A is 1. We will increment index 1 of C to 1. After 3 iterations so far our
        C array looks like this [0,1,1,0,0,1,0,0,0]. By the end of the iteration the C array looks like this
        [1,1,3,1,0,2,1,1,1].
        4. The next step is to update C array. We're going to keep adding next element to the previous element.
        [1,2,5,6,6,8,9,10,11] -> the element 11 should be exactly the same as number of elements from A

        Note: the size of C should be size of A or less
         */
        int[] nums = {7,6,3,5,7,2,3,5,6,0};
        countingSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void countingSort(int[] list){

        int k = Arrays.stream(list).max().getAsInt();

        int count[] = new int[k+1];
        int list2[] = new int[list.length];

        for (int i = 0; i < list.length; i++){
            ++count[list[i]];
        }

        for (int i = 1; i <= k; i++){
            count[i] = count[i] + count[i-1];
        }

        for (int i = list.length-1; i>=0; i--){
            list2[--count[list[i]]] = list[i];
        }

        for (int i = 0; i < list.length; i++){
            list[i] = list2[i];
        }
    }
}
