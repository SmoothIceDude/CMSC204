@SuppressWarnings("serial")
public class NoLowerAlphaException extends Exception {
   public NoLowerAlphaException()
   {  
	   super(" The password must contain at least one lowercase alphabetic character");
   }
  
   /**
   * Constructor that will take in a message, which will be displayed if NoLowerAlphaException is thrown.
   */
   public NoLowerAlphaException(String password)
   {  
       super(password);  
   }

}