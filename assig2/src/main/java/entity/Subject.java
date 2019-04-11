package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int subjectID;
	
	@OneToMany
	protected Users user;
	
	@Column
	protected String name;
	
	/*public Subject(int id, int tID, String n)
	{
		ID = id;
		teacherID = tID;
		name = n;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSubjectID() {
		return subjectID;
	}

	public Users getUser() {
		return user;
	}
	
	public String toString()
	{
		return subjectID + ", " + user.toString() + ", " + name + "\n";
	}
}
