package codility;

public class GCFTwoNumbers {


    public static void main(String[] args) {


        System.out.println(findGCF(93,186));
    }


    public static int findGCF(int num1, int num2) {
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        int gcf = 0;
        for(int i =1; i <= min; i++){
            if (min % i == 0 && max % i == 0){
                gcf = i;
            }
        }
        return gcf;
    }
}
