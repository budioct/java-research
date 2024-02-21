package com.tutorial;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaResearchDevelopmentApplicationTests {

	@Autowired
	EntityManagerFactory entityManagerFactory;


	@Test
	void contextLoads() {
	}

	@Test
	void testConnectionDB(){

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try	{
			transaction.begin();

			transaction.commit();
		} catch (Exception e){
			transaction.rollback();
			throw new RuntimeException("Connection Error");
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}

	}

}
