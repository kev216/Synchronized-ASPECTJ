package logging;

import java.util.logging.*;
import org.aspectj.lang.*;
import banking.*;
//import org.apache.log4j.*;

import test.SimpleAccountTest;

public aspect LogAspect {

	// TO DO
	pointcut debitSynchro():execution(* *.SimpleAccountImpl.debit(..));
	pointcut creditSynchro():execution(* *.SimpleAccountImpl.credit(..));
	pointcut transferSynchro():execution(* *.InterAccountOperations.transfer(..));
	
	
	void around (float amount):debitSynchro()&&args(amount){
		synchronized(this){
			proceed(amount);
		}
	}
	
	void around (float amount):creditSynchro()&&args(amount){
		synchronized(this){
			proceed(amount);
		}
	}
	void around (Account from, Account to,float amount):transferSynchro()&&args(from,to,amount){
		synchronized(this){
			proceed(from,to,amount);
		}
	}

}