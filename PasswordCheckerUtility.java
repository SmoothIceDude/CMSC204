import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheckerUtility {

	public static void comparePasswords(String password,String passwordConfirm) throws UnmatchedException{
		if(password != passwordConfirm) {
			throw new UnmatchedException();
		}
	}
	
	public static boolean comparePasswordsWithReturn(String password, String passwordConfirm) {
		if(password.equals( passwordConfirm)) {
			return true;
		} else {
			return false;
		}
	
	}
	
	public static ArrayList<String> getInvalidPasswords(ArrayList<String> password){
		ArrayList<String> InvalidPassword = new ArrayList<>();
		for(String str: password) {
			try {
				isValidPassword (str);
			}catch(Exception e) {
				InvalidPassword.add(str + "" + e.getMessage());
			}
		}
		return InvalidPassword;
			
	}
	
	public static boolean hasBetweenSixAndNineChars(String password) {
		if(password.length()>=6 && password.length()<=9) {
			return true;
		}else {
			return false;
		}
	}
	
		public static boolean hasUpperAlpha(String password) throws NoUpperAlphaException{
			for(char c : password.toCharArray()){
				if (c >= 'A' && c <= 'Z')
		        	 return true;
				else {
		         }
		         }
			throw new NoUpperAlphaException();
		}
		
		public static boolean hasLowerAlpha(String password) throws NoLowerAlphaException{
			for(char c : password.toCharArray()){
				if (c >= 'a' && c <= 'z')
		        	 return true;
				else {
		         }
		         }
			throw new NoLowerAlphaException();
		}
		
		public static boolean hasDigit(String password) throws NoDigitException{
		for(char c : password.toCharArray()){
	         if(Character.isDigit(c)){
	        	 return true;
	         }
	         }
		throw new NoDigitException();
	}
	
	
	public static boolean hasSpecialChar(String password) throws NoSpecialCharacterException{
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		Matcher matcher = pattern.matcher(password); 
		boolean doesItMatch = matcher.matches();
		if (!matcher.matches()) {
			return true;
		}	else {
	throw new NoSpecialCharacterException();
	}
	}
	
		public static boolean hasSameCharInSequence(String password) throws InvalidSequenceException{
			char ch = password.charAt(0);
			if(Character.isLowerCase(ch) || Character.isUpperCase(ch) || Character.isDigit(ch) )
		       {
		           for (int i = 0; i < password.length() - 2; i++)
		           {
		               if( (password.charAt(i) == password.charAt(i + 1))   && (password.charAt(i) == password.charAt(i+2)) )
		               {
		                   throw new InvalidSequenceException();
		               }
		           }
		       }
			return true;
		}
	
	public static boolean isValidLength(String password) throws LengthException {
		if (password.length() >= 6) {
			return true;
		}
		else {
			throw new LengthException();
		}
	
	}
	
	public static boolean isValidPassword(String password)
            throws LengthException,
                   NoUpperAlphaException,
                   NoLowerAlphaException,
                   NoDigitException,
                   NoSpecialCharacterException,
                   InvalidSequenceException{
		if (isValidLength(password) && hasUpperAlpha(password) && hasLowerAlpha(password) && hasDigit(password)&& hasSpecialChar(password)
				&& 
				hasSameCharInSequence(password)
				) {
			return true;
			}
			else {
				return false;
			}
	}
	
	public static boolean isWeakPassword(java.lang.String password) throws WeakPasswordException{
		if(hasBetweenSixAndNineChars(password)) {
			return true;
		}else {
		return false;
	}
}

}	
