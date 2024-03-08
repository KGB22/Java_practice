public class T3 {
    public static void main(String[] args) {
        //구구단을 출력해보자.

        int a = 1;
        int b = 1;

        while (a <= 9) { //

            while (b <= 9) {
                int result = a * b;
                System.out.println(a + " x " + b + " = " + result);
                b = b + 1;
                
            }
            b = 1;
            a = a + 1;
    
        }
    }
}
