package tn.esprit.spring.services;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Entreprise;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceImplTest {
	@Autowired
	IEntrepriseService us;

	@Test
	public void testAjouterEntreprise() {

		
		Entreprise u = new Entreprise("Hadir", "rr"); 
		
		int enAdded = us.ajouterEntreprise(u); 
		Integer x = (Integer) enAdded;
		
		assertEquals(u.getName(),"Hadir");

		//assertEquals(x.toString().getClass().getName(), u.getName());
	}

}
