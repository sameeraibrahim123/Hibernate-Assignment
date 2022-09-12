package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Author")
public class Author implements Serializable
{

	private static final long serialVersionUID = 1L;

	@Id
	private int author_Id;
	private String firstName;
	private String middleName;
	private String lastName;
	private int phoneNo;
	public int getAuthor_Id() {
		return author_Id;
	}
	public void setAuthor_Id(int author_Id) {
		this.author_Id = author_Id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}