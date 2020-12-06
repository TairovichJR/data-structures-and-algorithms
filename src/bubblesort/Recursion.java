package bubblesort;

public class Recursion {


    public static void main(String[] args) {

        System.out.println(iterativeFactorial(6));
    }

    /*
    To understand how recursion works:
    0! = 1;                 So factorial of a zero is always one
    1! = 1 * 0! = 1
    2! = 2 * 1! = 2 * 1
    3! = 3 * 2! = 3 * 2 * 1
    4! = 4 * 3! = 4 * 3 * 3 * 1
     */

    public static int recursiveFactorial(int num){
        /*
            This is called 'Base Case'. Because eventually
            the recursive calls need to stop. Otherwise you will get
            stack overflow error.
        */
        if (num == 0){
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }

    public static int iterativeFactorial(int num){
        if (num == 0){
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *=  i;
        }
        return factorial;
    }

}
