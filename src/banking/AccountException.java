package banking;


public class AccountException
	extends Exception {
	
	/**
	 * Constructs an <code>AccountException</code> with 
	 * no detail message.
	 */
	public AccountException()
	{
		super();
	}

	/**
	 * Constructs an <code>AccountException</code> with 
	 * the specified detail message.
	 * 
	 * @param	message 	The detail message
	 */
	public AccountException(String message)
	{
		super(message);
	}
}