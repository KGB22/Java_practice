package March5;

public class Main {
    public static void main(String[] args) {
       Summer summer = new Summer();
       System.out.println(summer.sum(1, 100, 2));
       System.out.println(summer.sum(20, 50, 3));
    }
}
class Summer{
    int sum(int start, int end, int increase) {

        if(start >= end) {
            System.out.println("increase의 값은 0보다 커야합니다.");
            return -1;
        }
        if(increase < 1) {
            System.out.println("increase의 값은 0보다 커야합니다.");
            return -1;
        }
        int result = 0;

        for(int i = start; i < end; i += increase) {
            result += i;
        }
        return result;
    }
}
