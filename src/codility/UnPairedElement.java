package codility;


import java.util.HashMap;
import java.util.Map;

public class UnPairedElement {


    public static void main(String[] args) {

        int[] A = {1,2,3,3,2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A){

        Map<Integer, Integer> nums = new HashMap<>();
        for (int i = 0; i < A.length; i++){
            if (nums.containsKey(A[i])){
                int occurrence = nums.get(A[i]);
                nums.put(A[i],++occurrence);
            }else{
                nums.put(A[i],1);
            }
        }
        for (Integer key : nums.keySet()){
            int repeated = nums.get(key);
            if (repeated % 2 != 0){
                return key;
            }
        }
        return 0;
    }
}
