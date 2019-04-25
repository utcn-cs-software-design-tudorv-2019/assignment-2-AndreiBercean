package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "enrolment")
public class Enrolment 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int enrolmentID;
	
	@Column
	protected int studentID;
	
	@Column
	protected int subjectID;
	
	@Column
	protected float grade;
	
	public Enrolment(int id, int s, int sub, float g)
	{
		enrolmentID = id;
		studentID = s;
		subjectID = sub;
		grade = g;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public int getEnrolmentID() {
		return enrolmentID;
	}

	public int getStudent() {
		return studentID;
	}

	public int getSubject() {
		return subjectID;
	}
	
	public String toString()
	{
		return"\nID = " + enrolmentID + "\nstudent = " + studentID + "\nsubjectID = " + subjectID + "\ngrade = " + grade;
	}
}
