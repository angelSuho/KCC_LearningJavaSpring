package kosa.thread;

public class MultiThreadExample05 {
	public static void main(String[] args) {
		SharedArea area = new SharedArea();
		area.account1 = new Account("111-111-1111", "이몽룡", 20_000_000);
		area.account2 = new Account("222-222-2222", "성춘향", 10_000_000);
		
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
		thread1.start();
		thread2.start();
	}
}
