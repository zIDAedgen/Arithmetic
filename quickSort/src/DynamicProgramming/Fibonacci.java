package DynamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(BottomUp.fiboBottomUp(5));
    }
}

class BottomUp {
    public static int fiboBottomUp(int n) {

        int[] table = new int[n + 1];
        table[0] = 0;
        table[1] = 1;
        table[2] = 1;

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 1;
        }



        for (int i = 3; i < n + 1; i++ ) {
            table[i] = table[i - 1] + table[i - 2];
        }
        return table[n];

    }


}
