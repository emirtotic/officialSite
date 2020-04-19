package test.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

@Entity
@Table(name = "contact")
public class Contact {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	@NotNull
	@NotEmpty(message = "Name and surname are required")
	private String nameAndSurname;
	@Column
	@NotNull
	@NotEmpty(message = "email adress is required")
	private String email;
	@Column
	@NotNull
	@NotEmpty(message = "Enter your message")
	private String message;
	
	public Contact() {
		
	}
	
	public Contact(String nameAndSurname, String message) {
		super();
		this.nameAndSurname = nameAndSurname;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameAndSurname() {
		return nameAndSurname;
	}

	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		
		return "Kontakt: " + nameAndSurname;
	}
	
	
}
