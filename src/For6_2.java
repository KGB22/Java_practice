public class For6_2 {
    public static void main(String[] args) {
        //1 + (-2) + 3 + (-4),...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.

        int qwer = 1;
        int sum = 0;

        for(int a = 1; a <= 10000; a++) {
            sum = sum + a * qwer;
            if (sum >= 100) {
                System.out.println(a);
                break;
            }
            qwer *= -1;
        }

        

    }

}
