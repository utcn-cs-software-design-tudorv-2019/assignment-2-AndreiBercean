package services;

import java.util.List;

import java.util.List;
import javax.inject.Inject;
import entity.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import repository.*;

public class TeacherService 
{
	@Inject
	StudentRepository str;
	@Inject
	UsersRepository usr;
	@Inject
	SubjectRepository sjr;
	@Inject
	EnrolmentRepository enr;
	
	public Users viewUserInfo(int id)
	{
		List<Users> result = usr.select();
		for(Users u : result)
		{
			if(u.getID() == id)return u;
		}
		return null;
	}
	
	public void edit(Users x)
	{
		usr.update(x);
	}
	
	public ObservableList<Subject> viewSubjects()
	{
		ObservableList<Subject> list = FXCollections.observableArrayList();
		for(Subject s : sjr.select())
		{
			list.add(s);
		}
		return list;
	}
	
	public ObservableList<Report> reportStudent(int ID)
	{
		/*ObservableList<Report> list = FXCollections.observableArrayList();
		for(Report s : report.SELECT(ID))
		{
			list.add(s);
		}
		return list;*/
		return null;
	}
	
	public ObservableList<Users> viewUsers()
	{
		ObservableList<Users> list = FXCollections.observableArrayList();
		for(Users s : usr.select())
		{
			list.add(s);
		}
		return list;
	}
	
	public void gradeStudent(int ID, int studentID, int subjectID, float grade)
	{
		enr.update(new Enrolment(ID, studentID, subjectID, grade));
	}
}
