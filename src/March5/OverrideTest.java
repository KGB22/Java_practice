package March5;

public class OverrideTest {
    public static void main(String[] args) {
        
        MyPoint p = new MyPoint();
        p.x = 3;
        p.y = 2;
        p.z = 1;
    }

}class Point {
    int x;
    int y;
    String getLocation() {
        return "x: " + x + ", y:" + y;
    }
}class MyPoint extends Point {
    int z;
    // 조상 Point 클래스의 getLocation을 오버라이딩
    // 오버라이딩의 경우 내용만 수정 가능함
    String getLocation() {
        return "x: " + x + ", y:" + y + ", z: " + z;
    }

}

