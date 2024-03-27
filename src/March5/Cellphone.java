package March5;

class CellPhone {
    String model;
    String color;

    void powerOn() {
        System.out.println("전원을 켭니다.");
    }
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
    void bell() {
        System.out.println("벨이 울립니다.");
    }
    void sendVoice(String message){
        System.out.println("나: " + message);
    }
    void receiveVoice(String message) {
        System.out.println("상대방: " + message); 
    }
    void hangUp() {
        System.out.println("전환을 끊습니다."); 
    }

}
class DmCellPhone extends CellPhone { 
    int channel;

    DmCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb() {
        System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
    }
    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("채널 " + channel + "번으로 바꿉니다.");
    }
    void turnOffDmb() {
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }
}
class DmCellPhoneExample {
    public static void main(String[] args) {
        DmCellPhone dmCellPhone = new DmCellPhone("자바폰", "검정", 10);

        System.out.println("모델: " + dmCellPhone.model);
        System.out.println("색상: " + dmCellPhone.color);

        System.out.println("채널: " + dmCellPhone.channel);

        dmCellPhone.powerOn();
        dmCellPhone.bell();
        dmCellPhone.sendVoice("여보세요.");
        dmCellPhone.receiveVoice("안녕하세요 저는 김규빈인데요.");
        dmCellPhone.sendVoice("아 네네 안녕하세요.");
        dmCellPhone.hangUp();

        dmCellPhone.turnOnDmb();
        dmCellPhone.changeChannelDmb(12);
        dmCellPhone.turnOffDmb();
    }
}