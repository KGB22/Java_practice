public class T10 {
    public static void main(String[] args) {
        // 자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다. 
        // 그 합이 언제(몇을 더했을 때) 1000을 넘어서는지 , 그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해 보자.

        int a = 1;
        int sum = 0;

        while (true) {
            if (a % 2 == 1 || a % 6 == 0) {
                sum = sum + a;
            }
            if (sum > 1000) {
                break;
            }
            a = a + 1;
        }
        System.out.println(a + "를 마지막으로 더했을 때 1000을 넘는다.");
        System.out.println("1000을 넘어서는 값은 " + sum + "이다.");
    }

}
