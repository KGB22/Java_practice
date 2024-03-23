package March4;

public class Main3 {
    public static void main(String[] args) {
        StudentDto s1 = new StudentDto();
        s1.setName("치타");
    }
}

class StudentDto {
    private String name;
    private int age;
    private int score;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

}
