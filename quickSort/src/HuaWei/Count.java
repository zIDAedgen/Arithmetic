package HuaWei;

import java.util.Arrays;
import java.util.Scanner;

//2. 计算字符个数
//String
public class Count {
    public void outcome() {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        String line1Up = line1.toUpperCase();
        String line2Up = line2.toUpperCase();

        System.out.println(line2Up);
        int counter = 0;
        if (line1Up != null && line2Up.length() == 1) {

            String[] check = line1Up.split("");
            System.out.println(line2Up instanceof String);
            System.out.println(Arrays.toString(check));
            for (String s : check) {
                System.out.println(s);
                //while using "==", there will not work as what you want
                if (s.equals(line2Up)) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }



}
