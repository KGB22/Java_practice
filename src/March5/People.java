package March5;

public class People {
    public String name;
    public String ssn;

    public People(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

}
class Student1 extends People {
    public int studentNo;

    public Student1(String name, String ssn, int studentNo) {
        super(name, ssn); // 부모생성자 호출
        this.studentNo = studentNo;
    }

}
class Student1Example {
    public static void main(String[] args) {
        Student1 student1 = new Student1("김치타", "123456-1234567", 1);
        System.out.println("name: "+ student1.name); // 부모에게 상속받은 필드 출력
        System.out.println("ssn: " + student1.ssn); // 부모에게 상속받은 필드 출력
        System.out.println("studentNo: " + student1.studentNo);
    }
}
