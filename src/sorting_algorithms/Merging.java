package sorting_algorithms;


import java.util.Arrays;

class Merging{

    /*
    We need to understand how to merge two sorted arrays into a new list
    before we can apply merge sort algorithm
    Time complexity is
     */

    /**
     *
     * @param list1 is the first list
     * @param list2 is the second list
     * @param list1Length is the length of the first list
     * @param list2Length is the length of the second list
     * @return
     */
    public static int[] merge(int[] list1, int[] list2, int list1Length, int list2Length){

        int i = 0, j = 0, k = 0;
        int[] newList = new int[list1.length+list2.length];

        //traverse both arrays
        while (i < list1Length && j < list2Length){
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (list1[i] < list2[j]){
                newList[k++] = list1[i++];
            }else{
                newList[k++] = list2[j++];
            }
        }
        // Store remaining elements of first array
        while (i < list1Length){
            newList[k++] = list1[i++];
        }
        // Store remaining elements of second array
        while (j < list2Length){
            newList[k++] = list2[j++];
        }
        return newList;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {6,7,8,9,10};
        int n1 = nums1.length;
        int n2 = nums2.length;
        System.out.println(Arrays.toString(merge(nums1, nums2, n1, n2)));

        /*
          In fact more than 2 lists can be merged. Consider the following scenario:
          A = [1,2,3,4]
          B = [5,6,7,8]
          C = [3,4,5,6]
          D = [7,8,9,10]

          What we could do is merge A and B and return a newly merged list. Merge C and D and return a new list
          And finally merge [A+B] and [C+D]
         */

        int[] a = {1,2,3,4,5};
        int[] b = {2,3,4,5,6};
        int[] c = {11,12,13,14,15};
        int[] d = {6,7,8,9,10,12,15};

        int[] e = merge(a, b, a.length, b.length);
        int[] f = merge(c,d, c.length, d.length);
        int[] g = merge(e,f, e.length, f.length);
        System.out.println(Arrays.toString(g));
    }

}
