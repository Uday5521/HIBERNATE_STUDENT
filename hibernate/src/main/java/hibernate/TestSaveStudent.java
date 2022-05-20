package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student s = new Student();
		s.setId(1);
		s.setName("priya");
		s.setPercentage(60.00);
		
		s.setId(2);
		s.setName("dinga");
		s.setPercentage(70.00);

		s.setId(3);
		s.setName("ramu");
		s.setPercentage(80.00);
		
		entityTransaction.begin();
		entityManager.persist(s);
		entityTransaction.commit();
		System.out.println("-------------------Done------------------");
	}
}
