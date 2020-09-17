

	@SuppressWarnings("serial")
	public class InvalidSequenceException extends Exception {
	  
	   public InvalidSequenceException()
	   {  
		   super (" The password cannot contain more than two of the same character in sequence.");
	   }
	  
	   /**
	   * Constructor that will take in a message, which will be displayed if InvalidSequenceException is thrown.
	   */
	   public InvalidSequenceException(String password)
	   {  
	       super(password);  
	   }

	}

