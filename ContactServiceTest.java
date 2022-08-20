package contacts;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContactServiceTest {
	
	@Test
	public void testAddContact() {
		Contact testContact = new Contact();
		testContact.setContactId("12345");
		ContactService.addContact(testContact, "12345");
		
		assertTrue(ContactService.getContact("12345") == testContact);
	}
	
	@Test
	public void testDeleteContact() {
		Contact testContact = new Contact();
		testContact.setContactId("12345");
		
		ContactService.addContact(testContact, "12345");
		ContactService.deleteContact("12345");
		
		assertTrue(ContactService.getContact("12345") == null);
	}
	
	@Test
	public void testUpdateFirstName() {
		Contact testContact = new Contact();
		testContact.setFirstName("Cody");
		
		ContactService.addContact(testContact, "12345");
		
		assertTrue(ContactService.getContact("12345").getFirstName() == "Cody");
		
		ContactService.updateFirstName("12345", "CodyTested");
		
		assertTrue(ContactService.getContact("12345").getFirstName() == "CodyTested");
	}

	@Test
	public void testUpdateLastName() {
		Contact testContact = new Contact();
		testContact.setLastName("Gregory");
		
		ContactService.addContact(testContact, "12345");
		
		assertTrue(ContactService.getContact("12345").getLastName() == "Gregory");
		
		ContactService.updateLastName("12345", "CodyTested");
		
		assertTrue(ContactService.getContact("12345").getLastName() == "CodyTested");
	}
	
	@Test
	public void testUpdatePhone() {
		Contact testContact = new Contact();
		testContact.setPhone("3013956534");
		
		ContactService.addContact(testContact, "12345");
		
		assertTrue(ContactService.getContact("12345").getPhone() == "3013956534");
		
		ContactService.updatePhone("12345", "1234567890");
		
		assertTrue(ContactService.getContact("12345").getPhone() == "1234567890");
	}
	
	@Test
	public void testUpdateAddress() {
		Contact testContact = new Contact();
		testContact.setAddress("Camden, NC");
		
		ContactService.addContact(testContact, "12345");
		
		assertTrue(ContactService.getContact("12345").getAddress() == "Camden, NC");
		
		ContactService.updateAddress("12345", "Alexandria, VA");
		
		assertTrue(ContactService.getContact("12345").getAddress() == "Alexandria, VA");
	}
}
