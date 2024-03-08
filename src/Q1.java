public class Q1 {
    public static void main(String[] args) {
        //문제: 130부터 2312까지의 합을 구해보세요.
        int x = 130;
        int sum = 0;

        while(x <= 2312){
            sum = sum + x;
            x = x + 1;
        }
        System.out.println(sum);
    }
}
