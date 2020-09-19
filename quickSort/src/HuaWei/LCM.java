package HuaWei;

import java.util.Arrays;
import java.util.Scanner;

public class LCM {
    //LCM means least common multiple
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        LCM.lcm(m);
        LCM.lcm(n);
    }

    private static int[] lcm(int a) {
        int dec = 2;
        int temp = a;
        boolean flag = true;
        boolean flag2 = true;
        int length = 0;


        while (flag) {
            if (a % dec == 0) {
                a = a/dec;
                length = length + 1;
            } else {
                dec = dec + 1;
            }

            if(a == 1) {
                flag = false;
            }
        }

        int[] arrOne = new int[length];
        dec = 2;

        int pivot = 0;
        while (flag2) {
            if (temp % dec == 0) {
                temp = temp/dec;
                arrOne[pivot] = dec;
                pivot = pivot + 1;
                length = length + 1;
            } else {
                dec = dec + 1;
            }

            if(temp == 1) {
                flag2 = false;
            }
        }

        System.out.println(Arrays.toString(arrOne));


        return arrOne;
    }
}
