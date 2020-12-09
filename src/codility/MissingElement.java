package codility;

import java.util.Arrays;

public class MissingElement {


    public static void main(String[] args) {

        System.out.println(solution(new int[]{1,2}));
    }
    public static int solution(int[] A) {

        if (A.length == 0) return 1;
        Arrays.sort(A);
        int prev = 0;
        for (Integer n : A){
            if (++prev != n) return prev;
        }
        return ++prev;
    }
}
