public class T6_3 {
    public static void main(String[] args) {
        //1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.


        int x = 1;
        int y = -0;//1 앞에 -0이 있다고 생각하고 선언
        int sum = 0;

        while (x < 10000) {
            sum = sum + x + y;//x는 홀수, y는 짝수
            
            if (sum >= 100) {
                System.out.println(x);
                break;
                
            }
            x = x + 2;
            y = y - 2;

            
        }
    }

}
