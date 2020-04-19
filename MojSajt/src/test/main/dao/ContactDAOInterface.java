package test.main.dao;

import java.util.List;

import test.main.entity.Contact;

public interface ContactDAOInterface {

	public Contact getContact(int id);
	
	public void saveContact(Contact contact);
	
	public void deleteContact(int id);
	
	public List<Contact> getContactList();
	
}
