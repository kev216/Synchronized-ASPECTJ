package banking;


public class InsufficientBalanceException
	extends AccountException {
	
	/**
	 * Constructs an <code>InsufficientBalanceException</code> with 
	 * no detail message.
	 */
	public InsufficientBalanceException()
	{
		super();
	}

	/**
	 * Constructs an <code>InsufficientBalanceException</code> with 
	 * the specified detail message.
	 * 
	 * @param	message 	The detail message
	 */
	public InsufficientBalanceException(String message)
	{
		super(message);
	}
}