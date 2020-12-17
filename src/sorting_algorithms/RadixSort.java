package sorting_algorithms;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {

        /*
            Time complexity is O(d*(n+b)) where d is the number of digits in the element, n is number of all elements,
            b is base (buckets). In terms of numbers bases is 10, letters 26

            Radix sort is implemented based on the place value and the face value of each element.
            We start from the least significant digit (1's) and move toward most significant digit
            1. Given an array [15,1,321,10,802,2,123,90,109,11], we need to find the maximum number.
            2. In our case it is 802. Then we need to identify how many digits are there in 802 (3).
            3. Make all other numbers 3 digits, by putting 0's on the left side of other digits having less than 3 digits
            4. In this algo, we will have as many passes as the number of digits in the largest element, which is 3
            5. We will create a bucket with 0 to 9
            6. Start putting the elements into these buckets based on the right most digits.
         */

        int[] nums = {15,1,321,10,802,2,123,90,109,11};

        radixSort(nums, 10);

        System.out.println(Arrays.toString(nums));
    }


    public static void radixSort(int[] list, int n){
        int maxElement = Arrays.stream(list).max().getAsInt();

        for (int pos = 1; maxElement/pos>0; pos *= 10){
            countSort(list, n , pos);
        }
    }

    public static void countSort(int[] list, int n, int pos){

        int[] count = new int[10];
        int[] list2 = new int[list.length];
        for (int i = 0; i < n; i++){
            ++count[ (list[i]/pos) % 10];
        }
        for (int i = 1; i < count.length; i++){
            count[i] = count[i] + count[i-1];
        }
        for (int i = n-1; i>= 0; i--){
            list2[--count[(list[i]/pos)%10]] = list[i];
        }

        for (int i = 0; i < list.length; i++){
            list[i] = list2[i];
        }
    }
}
