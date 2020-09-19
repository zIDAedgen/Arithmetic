public class Running {
    /*
    public static void main(String[] args) {
        /*
        int[] arr = {1, 2, 3, 4, 3, 3, 1};
        int counter = 0;
        int find = 3;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != find) {
                continue;
            }
            counter++;
        }
        System.out.println(counter);

         */

        /*
        int[] arr = {0, 1, 2, 3};
        for (int num : arr) {
            System.out.print(num + " ");
        }

         */
        /*
        int Jerry = 85;
        int Henry = 60;
        int Anny = 43;
        switch (Jerry) {
            case 50:
                System.out.println("Pass");
            case 65:
                System.out.println("Credit");
            case 75:
                System.out.println("Distinct");
            case 85:
                System.out.println("High Distinct");

        }

         */

    /*
    public static int sums(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int d = Running.sums(1, 2);
        System.out.println(d);

    }

     */


    public static int fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }
    public static void main(String[] args) {
        double a = Math.pow(2, 3);
        int b = (int)Math.sqrt(9);
        double c = Math.ceil(10.5);
        double d = Math.floor(10.5);
        double e = Math.round(10.23);
        double ran = Math.random();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}