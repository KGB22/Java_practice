package March5;

public class Ex6_3 {
    public static void main(String[] args) {
    System.out.println("Card.wdith = " + Card.wdith); // 객체생성 없이 바로 사용가능함
    System.out.println("Card.height = " + Card.height);

    Card c1 = new Card();
    c1.kind = "Heart";
    c1.number = 4;

    Card c2 = new Card();
    c2.kind = "Spade";
    c2.number = 3;

    System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 높이: " + c1.height + ", 폭: " + c1.wdith + "이다." );
    System.out.println("c2은 " + c1.kind + ", " + c2.number + "이며, 높이: " + c2.height + ", 폭: " + c2.wdith + "이다." );
    
    c1.wdith = 30; // == Card.width
    c1.height = 40; // == Card.height
    System.out.println("c1의 높이와 폭을 변경했습니다.");
    
    System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 높이: " + c1.height + ", 폭: " + c1.wdith + "이다." );
    System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 높이: " + c2.height + ", 폭: " + c2.wdith + "이다." );
    // c1.width를 변경하면 c1.width만 변경되는게 아니라 Card.width가 변경되는 거임
}

}
class Card {
    String kind;
    int number;
    static int height = 300;
    static int wdith = 200;
}

