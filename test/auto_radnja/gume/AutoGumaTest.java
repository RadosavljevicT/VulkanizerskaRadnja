package auto_radnja.gume;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AutoGumaTest {
	AutoGuma guma ;
	@BeforeEach
	void setUp() throws Exception {
		
		guma = new AutoGuma();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAutoGuma() {
		
		guma = new AutoGuma();
		assertNotNull(guma);
		
	}

	@Test
	void testAutoGumaStringIntIntInt() {
	
		guma = new AutoGuma("Achilles", 20,200,50);
		
		assertNotNull(guma);
		assertEquals("Achilles", guma.getMarkaModel());
		assertEquals(20, guma.getPrecnik());
		assertEquals(200,guma.getSirina());
		assertEquals(50,guma.getVisina());
	}

	@Test
	void testSetMarkaModel() {
		
		guma.setMarkaModel("Achilles");
		
		assertEquals("Achilles", guma.getMarkaModel());
		
		
	}
	@Test
	void testSetMarkaModelNull() {
		
		
		assertThrows(java.lang.NullPointerException.class,() -> guma.setMarkaModel(null));
		
		
	}
	
	@Test
	void testSetMarkaModelKratakString() {
		
		
		assertThrows(java.lang.RuntimeException.class,() -> guma.setMarkaModel("al"));
		
		
	}

	@ParameterizedTest
	@CsvSource({
	"15, true",
	"18,true",
	"22, true"
		
	})
	void testSetPrecnik(int g, boolean eq) {
		
		guma.setPrecnik(g);
		
		assertEquals(eq,guma.getPrecnik()==g);
		
	}
	@ParameterizedTest
	@CsvSource({
	"12",
	"10",
	
		
	})
	void testSetPrecnikManjaVrednost(int g) {
		
		assertThrows(java.lang.RuntimeException.class,() -> guma.setPrecnik(g));
		
	}
	@ParameterizedTest
	@CsvSource({
	
	"23",
	"50"
		
	})
	void testSetPrecnikVecaVrednost(int g) {
		
		assertThrows(java.lang.RuntimeException.class,() -> guma.setPrecnik(g));
		
	}

	@ParameterizedTest
	@CsvSource({
		"135,true",
		"355,true",
		"200,true"
		
	})
	void testSetSirina(int g, boolean eq) {
		
		guma.setSirina(g);
		assertEquals(eq,guma.getSirina()==g);
	}
	@ParameterizedTest
	@CsvSource({
	"134",
	"10"
		
	})
	void testSetSirinaManjaVrednost(int g) {
		
		assertThrows(java.lang.RuntimeException.class,() -> guma.setSirina(g));
		
	}
	@ParameterizedTest
	@CsvSource({
	
	"356",
	"500"
		
	})
	void testSetSirinaVecaVrednost(int g) {
		
		assertThrows(java.lang.RuntimeException.class,() -> guma.setSirina(g));
		
	}

	@ParameterizedTest
	@CsvSource({
		"25, true",
		"95,true",
		"70, true",
		"30, true"
		
	})
	void testSetVisina(int g, boolean eq) {

		guma.setVisina(g);
		assertEquals(eq,guma.getVisina()==g);
	}
	@ParameterizedTest
	@CsvSource({
	
	"24",
	"5"
		
	})
	void testSetVisinaManjaVrednost(int g) {
		
		assertThrows(java.lang.RuntimeException.class,() -> guma.setVisina(g));
		
	}
	
	@ParameterizedTest
	@CsvSource({
	"96",
	"100"
		
	})
	void testSetVisinaVecaVrednost(int g) {
		
		assertThrows(java.lang.RuntimeException.class,() -> guma.setVisina(g));
		
	}

	@Test
	void testToString() {
		guma.setMarkaModel("Achillis");
		guma.setPrecnik(15);
		guma.setSirina(140);
		guma.setVisina(50);
		
		String s = guma.toString();
		assertTrue(s.contains("Achillis"));
		assertTrue(s.contains("15"));
		assertTrue(s.contains("140"));
		assertTrue(s.contains("50"));
	}

	@Test
	void testEqualsObject() {
		guma.setMarkaModel("Achillis");
		guma.setPrecnik(15);
		guma.setSirina(140);
		guma.setVisina(50);
		
		AutoGuma guma2 = new AutoGuma();
		guma2.setMarkaModel("Achillis");
		guma2.setPrecnik(15);
		guma2.setSirina(140);
		guma2.setVisina(50);
		
		assertTrue(guma.equals(guma2));
		
		
	}

}
