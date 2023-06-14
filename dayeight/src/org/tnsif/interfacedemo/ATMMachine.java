package org.tnsif.interfacedemo;

public interface ATMMachine {
	/* all the variable inside an interface are by default
	 * publiv static final
	 * so , here amount is final type and it must be
	 * initialize */
//int amount;
int amountWithdra=1250;	
int amountDeposit=2000;
/* by default all the methods inside an intrface
*  are public abstract*/
	void withdraw();
	void deposit();
	}
