package auto_radnja;
import java.util.LinkedList;
import auto_radnja.gume.AutoGuma;

/**
 * Interfejs Radnja koji dodaje gumu i pronalazi gumu u Vulkanizerskoj radnji
 *
 * @author Radosavljevic Tamara
 * 
 * @version 0.1
 *
 */
	public interface Radnja {
	
		/**
		 * Dodaje gumu u na pocetak liste.
		 * @param a predstavlja objekat klase AutoGuma
		 * @throw java.lang.NullPointerException ako je a null
		 * @throw java.lang.RuntimeException ukoliko ista guma vec postoji u listi.
		 */
		void dodajGumu(AutoGuma a);
		
		/**
		 * Pronalazi gumu u listi, uslov je da marka modela bude ista i zatim pravi novu listu sa svim gumama koje su iste marke.
		 * @param markaModel marka modela predstavlja jedan od atributa gume
		 * @return null ukoliko je marka modela null
		 * @return novaLista koja predstavlja listu guma iste marke
		 */
	
		LinkedList<AutoGuma> pronadjiGumu(String markaModel);
	}
