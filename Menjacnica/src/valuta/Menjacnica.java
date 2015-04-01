package valuta;

import java.util.GregorianCalendar;

import valuta.interfejsi.ValutaInterfejs;

public class Menjacnica implements ValutaInterfejs {

	private Valuta[] nizValuta=new Valuta[20];
		
	public void obrisiKurs(GregorianCalendar datum) {
		for (int i = 0; i < nizValuta.length; i++) {
			if(nizValuta[i].getDatum()==datum)
				nizValuta[i]=null;
		}

	}

	
	public double nadjiKurs(GregorianCalendar datum) {
		
		Valuta novaValuta=new Valuta();
	
		for (int i = 0; i < nizValuta.length; i++) {
			if(nizValuta[i].getDatum()==datum){
				novaValuta=nizValuta[i];
				break;
			}
		}
		
		return novaValuta.getKupovni();
	}


	
	public void dodavajKurs(String naziv, String skracenica,
			double prodajniKurs, double srednjiKurs, double kupovniKurs,
			GregorianCalendar datum) {
		
		Valuta novaValuta=new Valuta();
		novaValuta.setDatum(datum);
		novaValuta.setKupovni(kupovniKurs);
		novaValuta.setNaziv(naziv);
		novaValuta.setProdajni(prodajniKurs);
		novaValuta.setSkracenica(skracenica);
		novaValuta.setSrednji(srednjiKurs);
		
		for (int i = 0; i < nizValuta.length; i++) {
			if(nizValuta[i]!=null)
				nizValuta[i]=novaValuta;
		}
		
	}

}
