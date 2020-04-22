public class Practice {
    public static void main(String[] args) {
        char[] string = {'a','b','c' };
        Practice practice = new Practice();
        practice.printReverse(string);
    }
    private void printReverse(char [] str) {
        helper(0, str);
    }

    private void helper(int index, char [] str) {
        if (str == null || index >= str.length) {
            return;
        }

        helper(index + 1, str);
        System.out.print(str[index] + " ");

    }

}
