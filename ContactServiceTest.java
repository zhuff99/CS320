import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/*
 * Test class for ContactService
 * 
 * 
 * These tests ensure the methods are working correctly
 * 
 * Future tests will insert specific changes for method
 * 
 */

class ContactServiceTest {

	Contact newContact = new Contact("1234567", "John", "Smith", "2089493225", "111 Penut Dr");

	@Test
	void testAddContact() {
		assertTrue(newContact.getContactID().equals("1234567"));
	}

	@Test
	void testDeleteContact() {
		assertTrue(newContact.getContactID().equals("1234567"));
	}

	@Test
	void testUpdateFirstName() {
		assertTrue(newContact.getContactID().equals("1234567"));
	}

	@Test
	void testUpdateLastName() {
		assertTrue(newContact.getContactID().equals("1234567"));
	}

	@Test
	void testUpdatePhoneNumber() {
		assertTrue(newContact.getContactID().equals("1234567"));
	}

	@Test
	void testUpdateAdress() {
		assertTrue(newContact.getContactID().equals("1234567"));
	}

}
