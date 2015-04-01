package valuta.interfejsi;

import java.util.GregorianCalendar;

public interface ValutaInterfejs {

	public void dodavajKurs(String naziv, String skracenica,
			double prodajniKurs, double srednjiKurs, double kupovniKurs,
			GregorianCalendar datum);

	
	public void obrisiKurs(String naziv, GregorianCalendar datum);
	
	public double nadjiKurs(String naziv, GregorianCalendar datum, int kurs);

}
