package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateStudent {
	public static void main(String[] args, Object Student) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student = new Student();
		student.setId(3);
		student.setName("tom");
		student.setPercentage(70.00);

		entityTransaction.begin();
		entityManager.persist(Student);
		entityTransaction.commit();
	}
}