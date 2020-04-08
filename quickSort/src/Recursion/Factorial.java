package Recursion;

/**
 * if you are eager to study DP, then learning Recusion well is necessary
 *
 * Here are the steps : https://mp.weixin.qq.com/s/Hew44D8rdXb3pf8mZGk67w
 */



class Factorial {
    public int factorial(int n) {
        //base case
        if (n == 1) {
            return 1;
        }

        //relation
        return n * factorial(n - 1);
    }
}
