package repository;

import entity.Users;

public class LocalMain {
	
	static UsersRepository ur = new UsersRepository();
	
	public static void main(String[] args) {
		ur.create(new Users("a",4));
	}

}
