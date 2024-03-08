public class T9 {
    public static void main(String[] args) {
        //1부터 100까지 출력을 하고 난 다음에. 다시 거꾸로 100에서부터 1까지 출력을 하는 프로그램을 작성해보자.
        int a = 1;
        int b = 100;

        while (a <= 100) {
            System.out.println(a);
            a = a + 1;
            
        }
        while (b >= 1) {
            System.out.println(b);
            b = b - 1;
        }
    }

}
