package test;

import banking.AccountException;
import banking.SimpleAccountImpl;

public class ThCredit implements Runnable {

	public SimpleAccountImpl simple;

	public ThCredit(SimpleAccountImpl simple) {
		this.simple = simple;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			{

				try {
					simple.credit(100);
				} catch (AccountException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// 3000 ms
				try {
					// System.out.println("On attend 3s======");
					Thread.currentThread().sleep(3000);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
