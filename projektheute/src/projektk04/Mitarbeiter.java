package projektk04;

public class Mitarbeiter {

	private String MitarbeiterName;

	private String anrede;

	private String position;

	private int telefon;
	
	public Mitarbeiter (String string, String string2, String string3, int parameter4) {
		MitarbeiterName = string;
		anrede = string2;
		position = string3;
		telefon = parameter4;
	}

	public void loeschenMitarbeiter() {
		System.out.println("Welcher Mitarbeiter wollen Sie aus dem Serviceauftrag löschen?");
		
	//hier soll noch irgendwas kommen??

	}

	public void setMitarbeiterName() {

	}

	//public void getMitarbeiterName() {
		
	String getMitarbeiterName() { //Abrufen der Mitarbeiternamen
			return MitarbeiterName;
		}
	String getanrede() { 
		return anrede;
	}
	String position() {
		return position;
	}
	int telfon() {
		return telefon;
		
	}

	public void setServiceAuftrag() { //Array?

	}

	public void getServiceAuftrag() { //Array?

	}

}

