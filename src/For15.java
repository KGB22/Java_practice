public class For15 {
    public static void main(String[] args) {  
        //2~100사이의 소수를 구해보자    
        for(int targetNumber = 2; targetNumber <= 100; targetNumber++) {
            boolean isPrime = true;
            for(int a = 2; a < targetNumber; a++){
                if (targetNumber % a == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(targetNumber + "= 소수");
            }
        }

    }
}
