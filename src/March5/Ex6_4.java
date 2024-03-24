package March5;

public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath(); // 2.MyMath 객체 생성
        int result1 = mm.add(5, 3); // 3. MyMath 객체 사용 
        int result2 = mm.multiply(5, 3);
        int result3 = mm.substract(5, 3);
        double reuslt4 = mm.divide(5, 3);
        int result5 = mm.max(5, 3);

        System.out.println("덧셈: "+ result1);
        System.out.println("뺄셈: " + result2);
        System.out.println("곱셈: " + result3);
        System.out.println("나눗셈: " + reuslt4);
        System.out.println("두 숫자 중 큰 값: " + result5);

    }

}
class MyMath { // 1. MyMath 클래스 작성
    int add(int a, int b) {
        int result = a + b;
        return result; // == return a + b;
    } 
    int substract(int a, int b) {
        return a - b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
    double divide(double a, double b) {
        return a / b;
    }
    int max(int a, int b) {
        return a > b ? a : b;
    }
}
