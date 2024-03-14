public class For3_2 {
    public static void main(String[] args) {
        // 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
        
        int sum = 0;
        int tmepSum = 0;

        for(int a = 1; a <= 10; a++) {
            tmepSum += a;
            sum += tmepSum;
        }
        System.out.println(sum);
    }

}
