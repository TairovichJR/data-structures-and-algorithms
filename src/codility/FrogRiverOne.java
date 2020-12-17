package codility;

public class FrogRiverOne {
    public static void main(String[] args) {



        int[] n = {1,3,1,4,2,3,5,4};
        System.out.println(solution(5,n));
        // x = 1,2,3,4,5
    }

    public static int solution(int X, int[] A){

        int[]counter = new int[X+1];
        int ans = -1;
        int x = 0;
        for (int i=0; i<A.length; i++){
            if (counter[A[i]] == 0){
                counter[A[i]] = A[i];
                x += 1;
                if (x == X){
                    return i;
                }
            }
        }
        return ans;
    }
}