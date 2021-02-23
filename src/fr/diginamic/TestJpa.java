package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.diginamic.entites.Ville;
import fr.diginamic.utils.ConfigUtils;

public class TestJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test_jpa", ConfigUtils.getPassword());
		EntityManager em = entityManagerFactory.createEntityManager();
		Ville ville = em.find(Ville.class, 120);
		System.out.println(ville);
	}

}
