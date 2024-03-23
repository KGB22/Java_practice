package March4;

public class Main2 {
	public static void main(String[] args) {
		Account account1 = new Account("미쯔", 10000);
		Account account2 = new Account("치타", 5000);
		
		account1.deposite(10000);
		account1.deposite(10000);

		account1.withdraw(300);
		
		//...

		System.out.println(account1.getOwner() + "의 잔액은 " + account1.getBalance());
	}

}


class Account{
	private String owner; 
	private int balance; // 잔액 
	
	public Account(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
		
	public void deposite(int value) {
		balance += value;
		
	}
	public void withdraw(int value) {
		if(balance < value) {
			System.out.println("[error] 금액이 부족합니다.");
			return;
			
		}
		balance -= value;
		
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
}

