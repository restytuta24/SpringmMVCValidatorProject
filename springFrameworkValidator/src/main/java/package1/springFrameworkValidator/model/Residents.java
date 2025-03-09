package package1.springFrameworkValidator.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Residents {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotEmpty(message = "name is required")
	@Size(min = 3, message = "name must not be below 3 characters")
	private String firstName;
	@NotEmpty(message = "name is required")
	@Size(min = 3, message = "name must not be below 3 characters")
	private String lastName;
	private Date dob;
	private int age;
	@NotEmpty(message = "name is required")
	@Size(min = 3, message = "name must not be below 3 characters")
	private String nok;
	private String homeTown;
	
	
	public Residents() {
		
	}


	public Residents(int id, String firstName, String lastName, Date dob, int age, String nok, String homeTown) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.age = age;
		this.nok = nok;
		this.homeTown = homeTown;
	}


	public int getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getNok() {
		return nok;
	}


	public void setNok(String nok) {
		this.nok = nok;
	}


	public String getHomeTown() {
		return homeTown;
	}


	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}


	@Override
	public String toString() {
		return "Residents [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", age="
				+ age + ", nok=" + nok + ", homeTown=" + homeTown + "]";
	}
	
		
	
	
	
	
	
	
	
	
	
	
	

}
