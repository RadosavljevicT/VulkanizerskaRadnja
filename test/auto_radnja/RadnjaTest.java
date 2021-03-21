package auto_radnja;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import auto_radnja.gume.AutoGuma;

public abstract class RadnjaTest {
	
	protected VulkanizerskaRadnja radnja;

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDodajGumu() {
		
		AutoGuma guma = new AutoGuma();
		guma.setMarkaModel("abc");
		guma.setPrecnik(18);
		guma.setSirina(200);
		guma.setVisina(50);
		radnja.dodajGumu(guma);
		List <AutoGuma> rezultat = radnja.pronadjiGumu(guma.getMarkaModel());
		assertEquals(1,rezultat.size());
		assertTrue(rezultat.contains(guma));
	}
	
	@Test
	void testDodajGumuNull() {

		assertThrows(java.lang.NullPointerException.class, ()-> radnja.dodajGumu(null));
	}
	@Test
	void testDodajGumuVecPostoji() {
		AutoGuma g1 = new AutoGuma();
		g1.setMarkaModel("abc");
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("abc");
		
		radnja.dodajGumu(g1);
		assertThrows(java.lang.RuntimeException.class,()-> radnja.dodajGumu(g2) );
		
	}
	@Test
	void testPronadjiGumuNull() {
		
		radnja.pronadjiGumu(null);
	}
	
	@Test
	void testPronadjiGumuIstaMarka() {
		AutoGuma g1 = new AutoGuma();
		g1.setMarkaModel("abc");
		g1.setPrecnik(20);
		g1.setSirina(200);
		g1.setVisina(50);
		
		radnja.dodajGumu(g1);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("abc");
		g2.setPrecnik(18);
		g2.setSirina(150);
		g2.setVisina(40);
		
		radnja.dodajGumu(g2);
		
		List <AutoGuma> rezultat = radnja.pronadjiGumu("abc");
		assertEquals(2,rezultat.size());
		assertTrue(rezultat.contains(g1));
		assertTrue(rezultat.contains(g2));
		
	}
	@Test
	void testPronadjiGumuPraznaLista() {
		AutoGuma g1 = new AutoGuma();
		g1.setMarkaModel("abc");
		g1.setPrecnik(20);
		g1.setSirina(200);
		g1.setVisina(50);
		
		radnja.dodajGumu(g1);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("dfe");
		g2.setPrecnik(18);
		g2.setSirina(150);
		g2.setVisina(40);
		
		radnja.dodajGumu(g2);
		
		List <AutoGuma> rezultat = radnja.pronadjiGumu("jkl");
		assertEquals(0,rezultat.size());
		
	}
	

}
