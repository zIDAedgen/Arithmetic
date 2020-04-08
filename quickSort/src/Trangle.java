public class Trangle {
    static final double CHARGE = 12.25;
    public static void main(String[] args) {
        drawTriangle(4);

    }

    private static void drawTriangle(int row) {
        final int para = row;
        int layer = 1;
        while (layer <= row) {
            System.out.println("");
            layer++;
            int length = 1;
            while (length < layer) {
                System.out.print(length);
                length++;
            }
        }

    }
}
