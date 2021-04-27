import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserMainTest {
	boolean check = true;
	//FirstName
	/**
	 * @Method testValidFirstName tests Happy case for firstName
	 * @Test takes a correct input where firstName has at least 3 characters and first letter starts with cap 
	 * @return true
	 **/
	
	@Test
	void testValidFirstName() {
		 UserMain user = new UserMain();
		 boolean result = user.validFirstName("Vinayak");
		 Assert.assertEquals(check, result);
	}
	
	//FirstName
	/**
	* @Method testInvalidFirstName tests Sad case for firstName
	* @Test takes a correct input where firstName has at least 3 characters and first letter starts with cap 
	* @return false
	 **/
	
	@Test
	void testInvalidFirstName() {
		 UserMain user = new UserMain();
		 boolean result = user.validFirstName("vvinayak");
		 Assert.assertEquals(check, result);
	}
	
	//LastName
	/**
	* @Method testValidLastName test Happy case for LastName
	* @Test takes a correct input where lastName has at least 3 characters and first letter starts with cap 
	* @return true
	**/
	
	@Test
	void testValidLastName() {
		UserMain user = new UserMain();
		boolean result = user.validLastName("Naik");
		Assert.assertEquals(check, result);
	}
	
	//LastName
	/**
	* @Method testInvalidLastName test Sad case for LastName
	* @Test takes a correct input where lastName has at least 3 characters and first letter starts with cap 
	* @return false
	**/
	
	@Test
	void testInValidLastName() {
		UserMain user = new UserMain();
		boolean result = user.validLastName("naik");
		Assert.assertEquals(check, result);
	}
	
	@Test
	void testValidEmail() {
		UserMain user = new UserMain();
		boolean result = user.validEmail("vinayaknaik4196@gmail.com");
		Assert.assertEquals(check, result);
	}
	
	@Test
	void testInValidEmail() {
		UserMain user = new UserMain();
		boolean result = user.validEmail("//abc.co.in");
		Assert.assertEquals(check, result);
	}
	
	//PhoneNumber
	/**
	* @Method testValidPhoneNumber test happy case for PhoneNumber
	* @Test takes a correct input where PhoneNumber has 10 numbers and country code should start between 0-91.
	* Phone-Number should start between 7-9.
	* @return true
	**/
	
	@Test
	void testValidPhoneNumber() {
		UserMain user = new UserMain();
		boolean result = user.validPhoneNumber("919591626394");
		Assert.assertEquals(check, result);
	}
	
	//PhoneNumber
	/**
	* @Method testInValidPhoneNumber test sad case for PhoneNumber
	* @Test takes a correct input where PhoneNumber has 10 numbers and country code should start between 0-91.
	* Phone-Number should start between 7-9.
	* @return false
	**/
	
	@Test
	void testInValidPhoneNumber() {
		UserMain user = new UserMain();
		boolean result = user.validPhoneNumber("912346546788");
		Assert.assertEquals(check, result);
	}
	
	//Password
	/**
	* @Method testValidPassword test Happy case for password
	* @Test follows 4 rules
	* Rule 1- Password has at least 8 characters.
	* Rule 2- Password has at least 1 Upper Case.
	* Rule 3- Password has at least 1 Numeric values.
	* Rule 4- Password has at least 1 Special Character.
	* @return true
	**/
	
	@Test
	void testValidPassword() {
		UserMain user = new UserMain();
		boolean result = user.validPassword("Anap9P#lesL@d65ef");
		Assert.assertEquals(check, result);
	}
	
	//Password
	/**
	* @Method testValidPassword test Sad case for password
	* @Test follows 4 rules
	* Rule 1- Password has at least 8 characters.
	* Rule 2- Password has at least 1 Upper Case.
	* Rule 3- Password has at least 1 Numeric values.
	* Rule 4- Password has at least 1 Special Character.
	* @return false
	**/
	
	@Test
	void testInValidPassword() {
		UserMain user = new UserMain();
		boolean result = user.validPassword("Aacdef");
		Assert.assertEquals(check, result);
	}
}
