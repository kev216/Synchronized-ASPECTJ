package test;

import banking.AccountException;
import banking.InterAccountOperations;
import banking.SimpleAccountImpl;

public class ThTransfer implements Runnable {

	public SimpleAccountImpl account1, account2;

	public ThTransfer(SimpleAccountImpl account1, SimpleAccountImpl account2) {
		// TODO Auto-generated constructor stub
		this.account1 = account1;
		this.account2 = account2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {

			try {
				InterAccountOperations.transfer(account1, account2, 100);
			} catch (AccountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
//				System.out.println("On attend 3s======");
				Thread.currentThread().sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}