@SuppressWarnings("serial")
public class WeakPasswordException extends Exception {
   public WeakPasswordException()
   {  
	   super("The password is OK but weak - it contains fewer than 10 characters");
   }
  
   /**
   * Constructor that will take in a message, which will be displayed if NoLowerAlphaException is thrown.
   */
   public WeakPasswordException(String password)
   {  
       super(password);  
   }

}