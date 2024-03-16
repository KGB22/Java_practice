public class For12 {
    public static void main(String[] args) {
        // 구구단의 짝수 단(2, 4, 6, 8단)만 출력하는 프로그램을 작성하되, 
        // 2단은 2X2까지, 4단은 4X4까지, 6단은 6X6까지 8단은 8X8까지만 출력하도록 구현하자.

        for(int a = 1; a <= 8; a++) {
            for (int b = 1; b <= a; b++) {
                if (a % 2 == 0) {
                    System.out.println(a + "*" + b + "=" + a * b);
                }
            }
        }
    }
    
}


