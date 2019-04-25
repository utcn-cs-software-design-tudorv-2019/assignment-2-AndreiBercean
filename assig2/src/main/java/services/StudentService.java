package services;

import java.util.List;
import javax.inject.Inject;
import entity.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import repository.*;

public class StudentService 
{
	@Inject
	StudentRepository str;
	@Inject
	UsersRepository usr;
	@Inject
	SubjectRepository sjr;
	@Inject
	EnrolmentRepository enr;
	
	public Users viewUserInfo(int id) {
		List<Users> result = usr.select();
		for(Users u : result)
		{
			if(u.getID() == id)return u;
		}
		return null;
	}
	
	public Student viewStudentInfo(int id) {
		List<Student> result = str.select();
		for(Student u : result)
		{
			if(u.getStudentID() == id)return u;
		}
		return null;
	}
	
	public void edit(Users x) {
		usr.update(x);
	}

	public void delete(Users x) {
		usr.delete(x);
	}
	
	public ObservableList<Subject> viewSubjects() {
		ObservableList<Subject> list = FXCollections.observableArrayList();
		for (Subject s : sjr.select()) {
			list.add(s);
		}
		return list;
	}
	
	public void enrol(int studentID, int subjectID) {
		enr.create(new Enrolment(1, studentID, subjectID, 0.0f));
	}
	
}
