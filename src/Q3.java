public class Q3 {
    public static void main(String[] args) {
        //구구단을 출력해보자 ㅜㅜ..

        int x = 2;
        int y = 1;

        while(x <= 9){

            
            while(y <= 9){
                int result = x * y;
                System.out.println(x + " x " + y + " = " + result);
                y = y + 1;
            }
            y = 1;
            x = x + 1;
        }


    }

}
