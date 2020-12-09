package codility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TapeEquilibrium {

    public static void main(String[] args) {


        System.out.println(solution(new int[]{-1000,1000}));


    }

    //Will have performance issues because of O(n*n)
    public static int solution(int[] A){
        List<Integer> original = Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> diffs = new ArrayList<>();
        for (int i = 1; i < A.length; i++){
            int sumLeft = 0;
            sumLeft = original.subList(0,i).stream().collect(Collectors.summingInt((Integer::intValue)));
            int sumRight = 0;
            sumRight = original.subList(i,A.length).stream().collect(Collectors.summingInt(Integer::intValue));
            int diff = Math.abs(sumLeft - sumRight);
            diffs.add(diff);
        }
        int min = diffs.stream().mapToInt(i -> i).min().getAsInt();
        return  min;
    }

}
