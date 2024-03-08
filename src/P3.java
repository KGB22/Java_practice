public class P3 {
    public static void main(String[] args) {
        // 변수 선언: 메모리를 생성함
        // 변수타입 변수명 = 초기값;
        int a = 13;
        double b = 13.3333; 
        String c = "안녕하세요";
        
        int d = 15;

        System.out.println("a");
        System.out.println(a);

        a = 15; // 변수 값 변경, int a 메모리가 이미 생성되어 있기때문에 int는 적지 않음
        System.out.println(a);

        a = 5000; // 변수 값 변경
        System.out.println(a);

    }

}
