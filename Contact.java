package contacts;

public class Contact {

	private String contactId = "0";
	private String firstName = "0";
	private String lastName = "0";
	private String phone = "0";
	private String address = "0";
	
	public Contact() {}
	
	
	/*
	 *  Constructor that utilizes class methods to ensure field accuracy
	 */
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
	
		setContactId(contactId);
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
		
	}
	
	
	/*
	 *  Sets the contact ID
	 */
	public void setContactId(String contactId) {
		
		if(contactId.length() <= 10 && contactId != null) {
			this.contactId = contactId;
		}
		else {
			this.contactId = "1";
		}
	}
	
	
	/*
	 *  Gets the contact ID
	 */
	public String getContactId() {
		return contactId;
	}
	
	
	/*
	 *  Sets the first name
	 */
	public void setFirstName(String firstName) {
		
		if(firstName.length() <= 10 && firstName != null) {
			this.firstName = firstName;;
		}
		else {
			this.firstName = "1";
		}
	}
	
	
	/*
	 *  Gets the first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	
	/*
	 *  Sets the last name
	 */
	public void setLastName(String lastName) {
		
		if(lastName.length() <= 10 && lastName != null) {
			this.lastName = lastName;;
		}
		else {
			this.lastName = "1";
		}
	}
	
	
	/*
	 *  Gets the last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	
	/*
	 *  Sets the phone number, if the entered string does not consist of numbers prints an error message
	 */
	public void setPhone(String phone) {
		
		try {
			double num = Double.parseDouble(phone);
		} catch (NumberFormatException e) {
			this.phone = "1";
			System.out.println("Error: Phone number needs to be a number");
		}
		
		if(phone.length() == 10 && phone != null) {
			this.phone = phone;
		}
		else {
			this.phone = "1";
		}
	}
	
	
	/*
	 *  Gets the phone number
	 */
	public String getPhone() {
		return phone;
	}
	
	
	/*
	 *  Sets the address
	 */
	public void setAddress(String address) {
		
		if(address.length() <= 30 && address != null) {
			this.address = address;
		}
		else {
			this.address = "1";
		}
	}
	
	
	/*
	 *  Gets the address
	 */
	public String getAddress() {
		return address;
	}
	
}
