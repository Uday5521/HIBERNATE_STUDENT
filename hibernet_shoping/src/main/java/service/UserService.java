package service;

import java.util.List;

import dao.UserDao;
import dto.User;

public class UserService {
	UserDao dao = new UserDao();
	
	public User insertUser(User user){
		return  dao.insertUser(user);
	}
	
	public User getUserById(int id){
		return dao.getUserById(id);
	}
	
	public User deleteUserById(int id){
		return dao.deleteUserById(id);
	}
	public User updateUser(User user){
		return dao.updateUser(user);
	}
	
	public List<User> getAllUsersById(){
		List user = dao.getAllUsersById();
		return user;
	}

}
