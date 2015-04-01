package valuta.interfejsi;

import java.util.GregorianCalendar;

public interface ValutaInterfejs {

	public void dodavajKurs(String naziv, String skracenica,
			double prodajniKurs, double srednjiKurs, double kupovniKurs,
			GregorianCalendar datum);

	public void obrisiKurs(GregorianCalendar datum);

	public double nadjiKurs(GregorianCalendar datum);
}
