package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int studentID;
	
	@Column
	protected int userID;
	
	@Column
	protected int group;
	
	public Student(int id, int g)
	{
		userID = id;
		group = g;
	}
	
	public int getGroup()
	{
		return group;
	}
	
	public void setGroup(int group)
	{
		this.group = group;
	}

	public int getStudentID() {
		return studentID;
	}

	public int getUserID() {
		return userID;
	}
}
