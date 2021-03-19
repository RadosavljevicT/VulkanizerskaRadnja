package auto_radnja.gume;

/**
 * Klasa koja predstavlja gumu za automobil
 * Guma za automobil ima marku modela koja prestavlja String, precnik, sirinu i visinu koje predstavljaju int vrednosti.
 * U ovoj klasi postavljamo vrednosti atributa, imamo equals i toString metodu
 * @author Tamara Radosavljevic
 * @version 0.1
 *
 */

public class AutoGuma {
	
	/**
	 * Marka modela gume kao String i vrednost je postavljena na null.
	 */
	private String markaModel = null;
	
	/**
	 * Precnik gume kao integer i vrednost je postavljena na -1.
	 */
	private int precnik = -1;
	
	/**
	 * Sirina gume kao integer i vrednost je postavljena -1.
	 */
	private int sirina = -1;
	
	/**
	 * Visina gume i vrednost je postavljena na -1.
	 */
	private int visina = -1;
	
	/**
	 * Konstruktor koji inicijalizuje objekat.
	 */
	public AutoGuma() {
	}
	
	/**
	 *Konstruktor koji inicjalizuje objekat i postavlja vrednosti za marku modela gume, njen precnik, sirinu i visinu. 
	 * @param markaModel Marka modela kao String
	 * @param precnik Precnik gume kao integer.
	 * @param sirina Sirina gume kao integer.
	 * @param visina Visina gume kao integer.
	 */
	
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) {
	super();
	setMarkaModel(markaModel);
	setPrecnik(precnik);
	setSirina(sirina);
	setVisina(visina);
	}
	
	/**
	 * Vraca marku modela gume.
	 * @return marku modela kao string.
	 */
	public String getMarkaModel() {
	return markaModel;
	}
	
	/**
	 * Postavlja marku modela gume na novu vrednost.
	 * @param markaModel marka modela gume kao String.
	 * @throws java.lang.NullPointerException ako je uneta marka modela null.
	 * @throws java.lang.RuntimeException ako je uneta marka modela koja ima manje od 3 znaka.
	 */
	public void setMarkaModel(String markaModel) {
	if (markaModel==null)
	throw new NullPointerException("Morate uneti marku i model");
	if (markaModel.length()<3)
	throw new RuntimeException("Marka i model moraju sadrzati bar 3 znaka");
	this.markaModel = markaModel;
	}
	
	/**
	 * Vraca precnik gume.
	 * @return precnik gume kao integer.
	 */
	
	public int getPrecnik() {
	return precnik;
	}
	
	/**
	 * Postavlja precnik gume na novu vrednost.
	 * @param precnik precnik gume kao string
	 * @throws java.lang.RuntimeException ukoliko precnik gume nije vrednost izmedju 13 i 22.
	 * 
	 */
	public void setPrecnik(int precnik) {
	if (precnik < 13 && precnik > 22)
	throw new RuntimeException("Precnik van opsega");
	this.precnik = precnik;
	}
	
	/**
	 * Vraca sirinu gume.
	 * @return sirina gume kao integer.
	 */
	public int getSirina() {
	return sirina;
	}
	
	/**
	 * Postavlja sirinu gume na novu vrednost.
	 * @param sirina sirina gume kao integer.
	 * @throws java.lang.RuntimeException ukoliko se sirina gume ne nalazi u opsegu od 135 do 355.
	 */
	public void setSirina(int sirina) {
	if (sirina < 135 && sirina > 355)
	throw new RuntimeException("Sirina van opsega");
	this.sirina = sirina;
	}
	
	/**
	 * Vraca visinu gume.
	 * @return visina gume kao integer.
	 */
	public int getVisina() {
	return visina;
	}
	
	/**
	 * Postavlja visinu gume na novu vrednost.
	 * @param visina visina gume kao integer.
	 * @throws java.lang.RuntimeException ukoliko se visina gume ne nalazi u opsegu izmedju 25 i 95.
	 */
	public void setVisina(int visina) {
	if (visina < 25 || visina > 95)
	throw new RuntimeException("Visina van opsega");
	this.visina = visina;
	}
	
	/**
	 * @return vraca String sa svim podacima o automobilskoj gumi.
	 */
	@Override
	public String toString() {
	return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
	", sirina=" + sirina + ", visina=" + visina + "]";
	}
	
	/**
	 * Poredi dve gume i vraca true ako su iste,a false ako nisu.
	 * Gume se porede porede po marki modela, precniku, visini i sirini i sva cetiri atributa moraju biti ista.
	 * 
	 * @return 
	 * <ul>
	 *   <li>true ako su sva cetiri objekta klase AutoGuma i imaju istu marku modela, precnik, sirinu i visinu </li>
	 *   <li>false u svim ostalim slucajevima.</li>
	 * </ul> 
	 */
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	AutoGuma other = (AutoGuma) obj;
	if (markaModel == null) {
	if (other.markaModel != null)
	return false;
	} else if (!markaModel.equals(other.markaModel))
	return false;
	if (precnik != other.precnik)
	return false;
	if (sirina != other.sirina)
	return false;
	if (visina != other.visina)
	return false;
	return true;
	}

}
