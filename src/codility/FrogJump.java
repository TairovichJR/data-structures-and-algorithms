package codility;

public class FrogJump {

    public static void main(String[] args) {

        System.out.println(solution2(3, 999111321, 7));
    }

    public static int solution(int X, int Y, int D) {

        int distance = (Y-X);
        if (distance % D == 0 ){
            return distance/D;
        }else{
            return distance/D + 1;
        }
    }

    public static int solution2(int X, int Y, int D) {

        int jump = X;
        int count = 0;
        while (jump < Y){
            jump += D;
            count++;
        }
        return count;
    }

}
