import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserMain {
	final String regFirstName = "^[A-Z]{1,}[a-z]{3,10}$";
	final String regLastName = "^[A-Z]{1,}[a-z]{3,10}$";
	final String regEmail = "^(?!\\.)[A-Za-z0-9]+([._%+-]?[0-9])*@[A-Za-z0-9-]+\\.[a-zA-Z]{2,}(\\.[A-Za-z]{2,})?$";	
	final String regPhoneNumber = "^[0/91]{2}?[7-9][0-9]{9}";
	final String regpassword = "(?=.[A-Z])(?=.[a-z])(?=.[0-9])(?=.[-+!@#$%^&*()]).{8,}";
	
	public static void main(String[] args) {
	}
	public boolean validFirstName(String firstName) {
	   Pattern pattern = Pattern.compile(regFirstName);
	   if(firstName == null) {
		   return false;
	   }
	   Matcher matcher =  pattern.matcher(firstName);
	   return matcher.matches();
	}
	
	public boolean validLastName(String lastName) {
		   Pattern pattern = Pattern.compile(regLastName);
		   if(lastName == null) {
			   return false;
		   }
		   Matcher matcher =  pattern.matcher(lastName);
		   return matcher.matches();
	}
	
	 public boolean validEmail(String email) {
		   Pattern pattern = Pattern.compile(regEmail);
		   if(email == null) {
			   return false;
		   }
		   Matcher matcher =  pattern.matcher(email);
		   return matcher.matches();
	}
	
	public boolean validPhoneNumber(String phoneNumber) {
		   Pattern pattern = Pattern.compile(regPhoneNumber);
		   if(phoneNumber == null) {
			   return false;
		   }
		   Matcher matcher =  pattern.matcher(phoneNumber);
		   return matcher.matches();
	}
	
	public boolean validPassword(String password) {
		   Pattern pattern = Pattern.compile(regpassword);
		   if(password == null) {
			   return false;
		   }
		   Matcher matcher =  pattern.matcher(password);
		   return matcher.matches();
	}
}
