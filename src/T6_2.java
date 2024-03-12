public class T6_2 {
    public static void main(String[] args) {
        //1 + (-2) + 3 + (-4),...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되나

        int x = 1;
        int sum = 0;
        int qwer = 1;
        while (x <= 100000) {
            sum = sum + x * qwer;
            if (sum >= 100) {
                System.out.println(x);
                break;
            
            }
            x = x + 1;
            qwer = qwer * -1;//첫번째 실행 때는 -가 되고, 두번째 실행 때는 +가 되고 ... + - + -가 반복되게 됨 / 스위칭 변수
        }
    }

}
