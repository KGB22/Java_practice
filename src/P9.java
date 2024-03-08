public class P9 {
    public static void main(String[] args) {
        // 반목문 ...: break, continue

        int a = 1;

        while (a < 10) {
            a = a + 1;

            if(a%2 != 0){
                continue; // 처음으로 되돌아가서 continue 아래있는 코드는 실행되지 않음
            }
            System.out.println(a);
            
            if(a == 5){
                break; //if - break가장 가까이에 돌고 있는 while문에서 탈출
            }
        }
    }

}
