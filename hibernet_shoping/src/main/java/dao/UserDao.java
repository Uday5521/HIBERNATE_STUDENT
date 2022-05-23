package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.User;

public class UserDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	EntityManager manager = factory.createEntityManager();
	
	public User insertUser(User user){
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(user);
		transaction.commit();
		return user;
	}

	public User getUserById(int id){
		User user = manager.find(User.class, id);
		return user;
	}
	
	public User deleteUserById(int id){
		EntityTransaction transaction = manager.getTransaction();
		User user = manager.find(User.class, id);
		transaction.begin();
		manager.remove(user);
		transaction.commit();
		return user;
	}
	public User updateUser(User user){
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(user);
		transaction.commit();
		return user;
}
	public List<User> getAllUsersById(){
		
		Query query=manager.createQuery("SELECT u FROM User u ");
		List<User> users = query.getResultList();
		return users;
		
	}
}
