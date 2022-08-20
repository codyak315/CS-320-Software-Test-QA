package contacts;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	
	private static Map<String, Contact> contactBook = new HashMap<>(); // Data structure to contain contacts
	
	
	/*
	 *  Takes in a contact and string parameter and adds the contact to map with associated string 
	 */
	public static void addContact(Contact contact, String id) {
		contact.setContactId("id");
		contactBook.put(id, contact);
	}
	
	
	/*
	 *  Removes contact from contact book
	 */
	public static void deleteContact(String id) {
		contactBook.remove(id);
	}

	
	/*
	 *  Updates the first name value of the given contact associated with string id
	 */
	public static void updateFirstName(String id, String firstName) {
		contactBook.get(id).setFirstName(firstName);
	}
	
	
	/*
	 *  Updates the last name value of the given contact associated with string id
	 */
	public static void updateLastName(String id, String lastName) {
		contactBook.get(id).setLastName(lastName);
	}
	
	
	/*
	 *  Updates the phone number value of the given contact associated with string id
	 */
	public static void updatePhone(String id, String phone) {
		contactBook.get(id).setPhone(phone);
	}
	
	
	/*
	 *  Updates the address value of the given contact associated with string id
	 */
	public static void updateAddress(String id, String address) {
		contactBook.get(id).setAddress(address);
	}
	
	
	/*
	 *  Returns the contact associated with the given string id
	 */
	public static Contact getContact(String id) {
		return contactBook.get(id);
	}
	
}
