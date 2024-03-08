public class Q2 {
    public static void main(String[] args) {
        //7부터 231까지의 정수 중 3의 배수만의 합

        int x = 7;
        int sum = 0;

        while (x <= 231) {
            if(x%3 == 0){
            sum = sum + x;

            }
            x = x + 1;
        }
    System.out.println(sum);
    } 

}
