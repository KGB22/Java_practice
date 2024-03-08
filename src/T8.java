public class T8 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;

        while (a <= 1000) {
            if (a%3 == 0) {
            sum = sum + a;
            }
            a = a + 1;
        }
        System.out.println(sum);
    }

}
