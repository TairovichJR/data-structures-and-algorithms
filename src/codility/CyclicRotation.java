package codility;

import java.util.Arrays;

public class CyclicRotation {


    public static void main(String[] args) {


        int[] list = {1,2,3,4,5};

        rightRotateArray(list, 2);

        System.out.println(Arrays.toString(list));

    }

    public static int[] rightRotateArray(int[] A, int K){
        if (K == 0 || A.length == 0) {
            return A;
        }
        for (int i = 0; i < K; i++){
            int last = A[A.length - 1];
            for (int j = A.length - 2; j >= 0; j--) {
                A[j + 1] = A[j];
            }
            A[0] = last;
        }
        return A;
    }
}
