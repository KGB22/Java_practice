public class For8 {
    public static void main(String[] args) {
        // 1부터 1000까지의 합을 구하는 코드를 작성하되 3의 배수만 더하는 코드를 작성하자
        int sum = 0;
        for(int a = 1; a <= 1000; a++) {
            if (a % 3 == 0) {
                sum += a;
            }
        }
        System.out.println(sum);
    }

}
