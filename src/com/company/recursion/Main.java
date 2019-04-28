package com.company.recursion;

public class Main {

    public static void main(String[] args) {
    }

    //formulae showing each factorial can be calculated by using n-1 factorial
    // 1! ((factorial)) =   1 * 0!
    // 2! = 2 * 1 = 2 *1! (1! = 1)
    // 3! = 3 * 2 * 1 or 3 * 2!
    // 4! = 4 * 3 * 2 * 1 or 4 * 3!
    // n! = n * (n-1)!



    public static int recursiveFactorial(int num){

        //base case
        if(num == 0){
            return 1;
        }

        //recursive call
        return num * recursiveFactorial(num-1);

        //int 3 would be recursing down to recursiveFactorial(0), checking each time for base case
        //adding to call stack, then recursing up in reverse order through the
        // call stack to recursiveFactorial(3) with 3 * 2
        // or num - 1

        //sample call stack
        //recursiveFactorial(0) = returns right away, then pops and recurses up
        //recursiveFactorial(1)
        // recursiveFactorial(2)
        //recursiveFactorial(3)
    }

    public static int IterativeFactorial(int num){
        if (num == 0){
            return 1;
        }

        //with 3 start with 1 * 1 -> 1 * 2 -> 2 * 3(i) -> return 6
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }
}
