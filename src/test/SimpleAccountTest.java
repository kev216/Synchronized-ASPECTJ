package test;

import banking.*;

public class SimpleAccountTest
{
	
	public static void main(String[] args)
		throws AccountException
	{
		SimpleAccountImpl account1, account2;
		int accountNb1 = 1, accountNb2 = 2;

		account1 = new SimpleAccountImpl(accountNb1, 500);
		account2 = new SimpleAccountImpl(accountNb2, 100);
		
		System.out
				.println("\nSimpleAccountTest.main: Initially, account1.balance="
						+ account1.getBalance()
						+ ", account2.balance="
						+ account2.getBalance());
		
		 
		Thread th1 = new Thread(new ThTransfer(account1,account2));
		Thread th2 = new Thread(new ThTransfer(account1,account2));
		Thread th3 = new Thread(new ThTransfer(account1,account2));
		Thread th4 = new Thread(new ThTransfer(account1,account2));
		Thread th5 = new Thread(new ThTransfer(account1,account2));
		
		Thread th6 = new Thread(new ThCredit(account1));
		Thread th7 = new Thread(new ThCredit(account1));
		Thread th8 = new Thread(new ThCredit(account1));
		Thread th9 = new Thread(new ThCredit(account1));
		Thread th10 = new Thread(new ThCredit(account1));
		
		
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();
		th8.start();
		th9.start();
		th10.start();
		
	}
	
}