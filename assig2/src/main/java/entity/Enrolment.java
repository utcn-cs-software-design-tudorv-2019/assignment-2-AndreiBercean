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
	
	@ManyToOne
	protected Student student;
	
	@ManyToOne
	protected Subject subject;
	
	@Column
	protected float grade;
	
	/*public Enrolment(int id, int s, int sub, float g)
	{
		ID = id;
		studentID = s;
		subjectID = sub;
		grade = g;
	}*/

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public int getEnrolmentID() {
		return enrolmentID;
	}

	public Student getStudent() {
		return student;
	}

	public Subject getSubject() {
		return subject;
	}
	
	public String toString()
	{
		return"\nID = " + enrolmentID + "\nstudent = " + student.toString() + "\nsubjectID = " + subject.toString() + "\ngrade = " + grade;
	}
}
