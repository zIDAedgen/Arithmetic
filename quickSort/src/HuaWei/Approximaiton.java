package HuaWei;
import java.util.Scanner;



//HJ7	取近似值
public class Approximaiton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        double temp = input;
        while (temp > 1) {
            temp = temp - 1;
        }

        temp = temp * 10;
        if (temp >= 5) {
            input = Math.ceil(input);
        } else {
            input = Math.floor(input);
        }

        System.out.println(input);
    }
}
