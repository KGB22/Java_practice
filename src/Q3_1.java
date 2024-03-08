public class Q3_1 {
    public static void main(String[] args) {
        //4단 7단을 제외한 구구단을 출력해보자 ㅜㅜ..

        int x = 2;
        int y = 1;

        while(x <= 9){

            
            while(y <= 9){
                int result = x * y;
                if(x != 4 && x != 7){
                System.out.println(x + " x " + y + " = " + result);

                }
                y = y + 1;
            }
            y = 1;
            x = x + 1;
        }

    }

}
