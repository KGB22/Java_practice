package March5;

public class Computer1Example {
    public static void main(String[] args) {
        int r = 10;

        Calculator1 calculator1 = new Calculator1();
        System.out.println("원면적: " + calculator1.areaCircle(r));
        System.out.println();

        Computer1 computer1 = new Computer1();
        System.out.println("원면적: " + computer1.areaCircle(r)); // 재정의 된 메소드 출력
    }

}
class Calculator1 {
    double areaCircle(double r) {
        System.out.println("Caculator1 객체의 areaCircle() 실행");
        return 3.14159 * r * r;
    }
}
class Computer1 extends Calculator1 {
    double areaCircle(double r) {
        System.out.println("Computer1 객체의 areaCircle() 실행"); 
        return Math.PI * r * r; // 재정의
    }
}
