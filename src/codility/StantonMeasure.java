package codility;

import java.util.Arrays;

public class StantonMeasure {


    public static int stantonMeasure(int[] arr) {

        final long countOf1 = Arrays.stream(arr).filter(i -> i == 1).count();
        int result = (int)Arrays.stream(arr).filter(i -> i == countOf1).count();
        return result;
    }
}
