public class For4 {
    public static void main(String[] args) {
    //	피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다. 
    //	예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다.
    //	1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.

        int left = 1;
        int right = 1;
        
        for(int a = 1; a <= 9; a++) { 
            int sum = left + right;
            left = right;
            right = sum;
        }
        System.out.println(left);
    } 

}
