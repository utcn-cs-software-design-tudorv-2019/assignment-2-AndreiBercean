package repository;

import entity.Student;
import entity.Users;

public class LocalMain {
	
	//static UsersRepository ur = new UsersRepository();
	static StudentRepository str = new StudentRepository();
	static SubjectRepository sur = new SubjectRepository();
	static EnrolmentRepository er = new EnrolmentRepository();
	
	public static void main(String[] args) {
		//ur.create(new Users("a",4));
		//ur.delete(new Users("a",4));
		
		str.create(new Student(11,34));
	}
}
