package March4;

public class Main1 {

	public static void main(String[] args) {
		QWER q1 = new QWER();
		
		q1.a = 10;
//		q1.d = 20; // private이기 때문에 활용이 제한됨
		System.out.println(q1.a);
		

	}

}


class QWER{
	public int a; // 공개
	private int d;  // 비공개

	
	void test() {
		System.out.println(a);
		System.out.println(d);
	}
	
}