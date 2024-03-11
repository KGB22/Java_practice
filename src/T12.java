public class T12 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;

        while (a < 9) {
            while (b < 9) {
                int result = a * b;
                if (a % 2 != 0) {
                    continue;
                }
                if (a >= b) {
                    System.out.println(a + " x " + b + " = " + result);
                }
                b=b+1;
            }
            b = 1;
            a = a + 2;
        }
    }
}
