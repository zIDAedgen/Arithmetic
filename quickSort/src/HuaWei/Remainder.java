package HuaWei;


import java.util.Scanner;

//7. 取近似值
//double
public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        int res = getResult(input);
        System.out.println(res);

    }

    public static int getResult(double num) {
        int refer = 1;

        while (num - refer > 1) {
            refer++;
        }

        double remainder = num - refer;
        if (remainder >= 0.5) {
            return refer + 1;
        } else {
            return refer;
        }
    }
}
