package HuaWei;

import java.util.Arrays;
import java.util.Scanner;

public class HuaWei {

    public static void main(String[] args) {



        Count count = new Count();
        count.outcome();

    }

    public void one() {
        Scanner input = new Scanner(System.in);
        String s = "";
        while (input.hasNextLine()) {
            s = input.nextLine();
            String[] splitted = s.split(" ");
            System.out.println(splitted[splitted.length - 1].length());
        }
    }

}
