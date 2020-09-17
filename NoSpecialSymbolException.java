	@SuppressWarnings("serial")
public class NoSpecialSymbolException extends Exception {

	   public NoSpecialSymbolException()
	   {  
		   super(" The password must contain at least one special character ");
	   }
	  
	   /**
	   * Constructor that will take in a message, which will be displayed if NoLowerAlphaException is thrown.
	   */
	   public NoSpecialSymbolException(String password)
	   {  
	       super(password);  
	   }

	}


