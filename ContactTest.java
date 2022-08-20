package contacts;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContactTest {

	private Contact testContact = new Contact();
	
	@Test
	public void testContactId() {
		testContact.setContactId("315");
		assertEquals(testContact.getContactId(), "315");
	}

	@Test
	public void testContactIdLength() {
		testContact.setContactId("12345678910");
		assertTrue(testContact.getContactId() == "1");
	}
	
	@Test
	public void testFirstName() {
		testContact.setFirstName("Cody");
		assertEquals(testContact.getFirstName(), "Cody");
	}
	
	@Test
	public void testFirstNameLength() {
		testContact.setFirstName("ThisNameIsTooLong");
		assertTrue(testContact.getFirstName() == "1");
	}
	
	@Test
	public void testLastName() {
		testContact.setLastName("Gregory");
		assertEquals(testContact.getLastName(), "Gregory");
	}
	
	@Test
	public void testLastNameLength() {
		testContact.setLastName("ThisNameIsTooLong");
		assertTrue(testContact.getLastName() == "1");
	}
	
	@Test
	public void testPhone() {
		testContact.setPhone("3013956534");
		assertEquals(testContact.getPhone(), "3013956534");
	}
	
	@Test
	public void testPhoneIsNum() {
		testContact.setPhone("NotANum");
		assertTrue(testContact.getPhone() == "1");
	}
	
	@Test
	public void testAddress() {
		testContact.setAddress("An Address");
		assertEquals(testContact.getAddress(), "An Address");
	}
	
	@Test
	public void testAddressLength() {
		testContact.setAddress("123456789101112131415161718192021222324252627282930");
		assertEquals(testContact.getAddress(), "1");
	}

}
