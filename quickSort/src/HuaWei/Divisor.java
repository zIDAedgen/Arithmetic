package HuaWei;
import java.util.Scanner;

//6.质数因子
//int
public class Divisor {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        long num = number.nextLong();
        String res = Divisor.divisor(num);
        System.out.print(res);

    }

    public static String divisor(long num) {
        int div = 2;
        String result = "";
        while (num != 1) {
            while (num % div == 0) {
                num = num / div;
                result = result + div + " ";
            }
            div++;
        }
        return result;
    }
}
