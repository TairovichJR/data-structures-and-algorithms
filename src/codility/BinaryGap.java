package codility;

public class BinaryGap {

    public static  int binaryGap(int N){

        if (N == 1){
            return 0;
        }
        String binary = Integer.toBinaryString(N);
        int count = 0;
        int max = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                count++;
            }
            if (binary.charAt(i) == '1') {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        return max;
    }
}
