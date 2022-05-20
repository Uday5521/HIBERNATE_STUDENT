package hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class TestGetMultipleStudent {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT s FROM Student s";

		Query query = entityManager.createQuery(sql);
		List<Student> student = query.getResultList();

		for(Student student1 : student){
			System.out.println("ID is "+student1.getId());
			System.out.println("NAME is "+student1.getName());
			System.out.println("PERCENTAGE "+student1.getPercentage());
			System.out.println("---------------------------------------");
		}

	}
}
