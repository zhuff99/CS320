/**
 * 
 */
/**
 * @author Zachary Huff
 * 
 *         Souther New Hampshire University 1/22/2023 CS320 Software Test
 *         Automation
 *         
 *         Module 3 Milestone and project_1 part 1
 *         
 *         This class create a Contact object
 *         This object takes in a contactID, firstname, lastname, phone number, and address
 *       
 *         getters and setters added for the contactService Class
 */
public class Contact {

	private String contactID;   // string that cannot be longer than 10 characters. The contact ID shall not be
								// null and shall not be updatable.
	private String firstName;   // cannot be longer than 10 characters. The firstName field shall not be null
	private String lastName;    // cannot be longer than 10 characters. The firstName field shall not be null
	private String phone;       // must be exactly 10 digits. The phone field shall not be null.
	private String address;     // no longer than 30 characters. The address field shall not be null.

	public Contact(String contactID, String firstName, String lastName, String phone, String address) {

		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}

		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid Name");
		}

		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Name");
		}

		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}

		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;

	}
	
	
	/*
	 * 
	 * Getters and setters added for use in the contactService class 
	 * and test cases
	 * 
	 */

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {

		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid Name");
		}

		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Name");
		}
		this.lastName = lastName;
	}

	public String getContactID() {
		return contactID;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.address = address;
	}

}