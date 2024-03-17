public class For14_1 {
    public static void main(String[] args) {
        //863은 소수인가?

        int num = 863;
        boolean isPrime = true;

        for(int a = 2; a < num; a++){
            if(num % a == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("소수다");
        } else {
            System.out.println("소수가 아니다");
        }
    }

}
