public class T2 {
    public static void main(String[] args) {
        //1부터 76까지의 합을 구하는 코드를 작성하자.

        int a = 1;
        int sum = 0;

        while (a <= 76) {
           // a = a + 1; 3002 
            sum = a + sum;   
            a = a + 1;
            
        }
        System.out.println(sum);
    }

}
