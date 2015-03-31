package valuta.interfejsi;

import java.util.GregorianCalendar;

public interface ValutaInterfejs {

	public void dodavajKurs(GregorianCalendar datum);
	
	public void obrisiKurs(GregorianCalendar datum);
	
	public double nadjiKurs(GregorianCalendar datum);
}
