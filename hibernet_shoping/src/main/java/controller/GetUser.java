package controller;

import java.util.List;

import dto.User;
import service.UserService;

public class GetUser {
	public static void main(String[] args) {
		UserService service = new UserService();
		// User user = service.getUserById(1);
		// System.out.println(user.getId());
		// System.out.println(user.getName());
		// System.out.println(user.getPassword());
		// System.out.println(user.getPhone());

		/*User user2 = new User();
		user2.setId(1);
		user2.setName("uday");
		user2.setPassword("uday@gmail.com");
		user2.setPhone(3459234804l);

		service.updateUser(user2);*/
		
		List<User> users3 = service.getAllUsersById();
		for(User user : users3){
			System.out.println("Id is "+user.getId());
			System.out.println("Name is "+user.getName());
		}

	}

}
