package March5;

class Car2 {
    String color; // 색상
    String gearType; // 변속기 종류 - auto, manual
    int door; // 문 개수

    Car2() {
        this("white" , "auto", 4);
    }

    Car2(String color) {
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

}
