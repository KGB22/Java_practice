public class T4 {
    public static void main(String[] args) {
        //구구단을 출력하되 7단과 6단은 제외하고 출력하자.

        int a = 1;
        int b = 1;

        while (a <= 9) {
            while (b <= 9) {
                int result = a * b;
                if (a != 6 && a != 7) {
                System.out.println(a + " x " + b + " = " + result );
                }
                b = b + 1;
            }
            b = 1;
            a = a + 1;
            
        }
    }

}
