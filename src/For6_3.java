public class For6_3 {
    public static void main(String[] args) {
        //1 + (-2) + 3 + (-4),...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
        int b = 0;
        int sum = 0;
        for(int a = 1; a <= 10000; a += 2, b -= 2) {
            sum = sum + a + b;
            if (sum >= 100) {
                System.out.println(a);
                break;
            }
        }
    }
}
