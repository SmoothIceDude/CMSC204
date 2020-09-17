	@SuppressWarnings("serial")
public class NoSpecialCharacterException extends Exception {

	   public NoSpecialCharacterException()
	   {  
		   super(" The password must contain at least one special character");
	   }
	  
	   /**
	   * Constructor that will take in a message, which will be displayed if NoLowerAlphaException is thrown.
	   */
	   public NoSpecialCharacterException(String password)
	   {  
	       super(password);  
	   }

	}


