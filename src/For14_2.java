public class For14_2 {
    public static void main(String[] args) {
        //863은 소수인가?
        
        int num = 863;
        int cnt = 0;

        for(int a = 2; a < num; a++) {
            if (num % a == 0) {
                cnt++;
                break;
            }
        }    
        if (cnt != 0) {
            System.out.println("소수가 아니다");
        } else {
            System.out.println("소수다");
        }
            
    }

}
