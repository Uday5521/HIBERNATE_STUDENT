package controller;

import dto.User;
import service.UserService;

public class InsertUser {
public static void main(String[] args) {
	
	User user=new User();
	user.setName("jerry");
	user.setPassword("3434");
	user.setPhone(45344334);
	UserService service = new UserService();
	User user2 = service.insertUser(user);
	System.out.println("id is:"+user2.getId());
}
}
