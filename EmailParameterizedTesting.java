import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class EmailParameterizedTesting {
	//variables
	public String email;
	public boolean expected;
	
	//Initialize variables using Constructor approach
	public EmailParameterizedTesting (String email, boolean expected) {
		this.email=email;
		this.expected=expected;
	}
	
	public List<EmailParameterizedTesting> inputFirst() {
		/**
		*Create an ArrayList Object
		* Initialize EmailParameterizedTesting add to the ArrayList object using add method
		* @return  returns list
		**/
		List<EmailParameterizedTesting>  list = new ArrayList<EmailParameterizedTesting>();
		list.add(new EmailParameterizedTesting("abc@yahoo.com",true));
		list.add(new EmailParameterizedTesting("abc-100@yahoo.com",true));
		list.add(new EmailParameterizedTesting("abc.100@yahoo.com",true));
		list.add(new EmailParameterizedTesting("abc.111@abc.com",true));
		list.add(new EmailParameterizedTesting("abc.@abc.com.com",true));
		list.add(new EmailParameterizedTesting("abc.+@100@gmail",true));
		list.add(new EmailParameterizedTesting("abc",false));
		list.add(new EmailParameterizedTesting("abc@gmail.com.la",false));
		list.add(new EmailParameterizedTesting("abc@gmail.com.aa.au",false));
		return list;
	}
	
	@Test
	public void validateEmail() {
		UserMain userMain = new UserMain();	
		Assert.assertEquals(this.expected,userMain.validEmail(email));
	}
}
