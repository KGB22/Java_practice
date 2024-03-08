public class T5 {
    public static void main(String[] args) {
        //1부터 200까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.

        int a = 1;
        int sum = 0;

        while (a <= 200) {
            if (a%2 != 0 && a%3 != 0) {
              sum = sum + a;            
            }
            a = a + 1;
        
        }   
        System.out.println(sum);
    }

}
