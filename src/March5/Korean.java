package March5;

class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("김미쯔", "011225-1234567");
        System.out.println("k1.name: " + k1.name);
        System.out.println("k1.ssn: " + k1.ssn);

        Korean k2 = new Korean("김치타", "981222-1323442");
        System.out.println("k2.name: " + k2.name);
        System.out.println("k2.ssn: " + k2.ssn);
    }
}

public class Korean {
    String nation = "대한민국";
    String name;
    String ssn;

    public Korean(String n, String s) {
        name = n;
        ssn = s;
    }

}
