package HuaWei;
import java.util.Scanner;


//1. 字符串最后一个单词的长度
//String
public class Length {
    public void runFunc() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] out = input.split(" ");
        System.out.println(out[out.length - 1].length());

    }
}
