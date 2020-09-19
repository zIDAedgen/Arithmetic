package HuaWei;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//4. 字符串分隔
//substring
//String
public class SubString {
    //abc
    //123456789
    public List<String> result = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String input = scanner.nextLine();

        List<String> myList = new ArrayList<String>();
        boolean flag = true;
        int counter = 0;
        while (scanner.hasNextLine() && flag) {
            String input = scanner.nextLine();
            myList.add(input);
            counter++;
            if (counter == 2) {
                break;
            }
        }
        for (String e : myList) {

        }
    }

    public void pudge(int length) {
        if (length / 8 == 0) {
            return;
        }

    }
}
