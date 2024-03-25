package March5;
// 오버로딩된 Board클래스를 this()를 활용하여 중복 코드를 제거하세요.
// Board객체를 생성하는 네가지 방법을 모두 기술해보세요.
class BoardExample {
    public static void main(String[] args) {
        
    
    Board board1 = new Board("title", "content");
    Board board2 = new Board("title", "content", "홍길동");
    Board board3 = new Board("title", "content", "홍길동","240325");
    Board board4 = new Board("title", "content", "홍길동","240325", 0);
    }
}
public class Board {
    String title;
    String content;
    String writer;
    String date;
    int hitcount;

    Board(String title, String content) {
        this(title, content,"로그인한 회원아이디", "현재컴퓨터날짜", 0);
    }
    Board(String title, String content,String writer) {
       this(title, content, writer, "현재 컴퓨터 날짜", 0);
    }
    Board(String title, String content, String writer, String date) {
       this(title, content, writer, date, 0);
    }
    Board(String title, String content, String writer, String date, int hitcount) {
        this.title = title; //this.필드 = 매개변수; iv와 cv를 구분하기 위해 iv에 this를 붙임
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitcount = hitcount;
    }

}
