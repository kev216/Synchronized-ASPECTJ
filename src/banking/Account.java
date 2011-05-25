package banking;



public interface Account {
	
	/**
	 * Returns the number of this account.
	 * 
	 * @return 	The account number.
	 */
	public int getAccountNumber();
	
	/**
	 * Returns the current balance of this account.
	 * 
	 * @return	The account balance.
	 * @throws	AccountException	If a problem occurs during
	 * this operation, e.g., a problem to access the underlying
	 * database if any.
	 */
	public float getBalance()
		throws AccountException;
	
	/**
	 * Sets the balance of this account.
	 * 
	 * @param amount	The balance to be set
	 * @throws	AccountException	If a problem occurs during
	 * this operation, e.g., a problem when updating the underlying
	 * database if any.
	 */
	public void setBalance(float amount)
		throws AccountException;
	
	/**
	 * Adds an amount to the current balance of this account.
	 * 
	 * @param 	amount	The amount to add.
	 * @throws	AccountException	If a problem occurs during
	 * this operation, e.g., a problem when accessing/updating 
	 * the underlying database if any.
	 */
	public void credit(float amount)
		throws AccountException;
	
	/**
	 * Deducts an amount from the current balance of this account.
	 * 
	 * @param 	amount				The amount to be deducted.
	 * @throws 	AccountException	In case the amount to deduct 
	 * is greater than the current balance, or if a problem occurs 
	 * when querying/updating the underlying database if any.
	 */
	public void debit(float amount)
		throws AccountException;
}