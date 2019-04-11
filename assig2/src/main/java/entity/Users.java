package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int userID;
	
	@Column
	protected String userName;
	
	@Column
	protected int age;
	
	public Users(String n, int a)
	{
		userName = n;
		age = a;
	}
	
	public Users() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String name) {
		this.userName = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getID()
	{
		return userID;
	}
	
	public String toString()
	{
		return"\nID = " + userID + "\nname = " + userName + "\nage = " + age;
	}
}
