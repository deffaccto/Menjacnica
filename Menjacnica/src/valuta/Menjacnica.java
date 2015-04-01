package valuta;

import java.util.GregorianCalendar;
import java.util.LinkedList;



import valuta.interfejsi.ValutaInterfejs;

public class Menjacnica implements ValutaInterfejs {


	private LinkedList<Valuta> listaValuta = new LinkedList<Valuta>();

	public void dodavajKurs(String naziv, String skracenica,
			double prodajniKurs, double srednjiKurs, double kupovniKurs,
			GregorianCalendar datum) {

		Valuta novaValuta = new Valuta();
		novaValuta.setDatum(datum);
		novaValuta.setKupovni(kupovniKurs);
		novaValuta.setNaziv(naziv);
		novaValuta.setProdajni(prodajniKurs);
		novaValuta.setSkracenica(skracenica);
		novaValuta.setSrednji(srednjiKurs);

		if (listaValuta.contains(novaValuta)) {

			throw new RuntimeException("Kurs vec postoji");
		}

		else {

			listaValuta.add(novaValuta);
		}

	}

	public void obrisiKurs(String naziv, GregorianCalendar datum) {

		if (naziv == null || naziv.equals("") || datum == null) {
			throw new RuntimeException();
		}

		for (int i = 0; i < listaValuta.size(); i++) {
			if (listaValuta.get(i).getNaziv() == naziv
					&& listaValuta.get(i).getDatum() == datum) {
				listaValuta.remove(listaValuta.get(i));
				break;
			}


		}

	}


	public double nadjiKurs(String naziv, GregorianCalendar datum, int kurs) {
		if (naziv == null || naziv.equals("") || datum == null) {
			throw new RuntimeException("Datum i naziv ne smeju biti null");
		}

		Valuta novaValuta = new Valuta();

		for (int i = 0; i < listaValuta.size(); i++) {
			if (listaValuta.get(i).getNaziv() == naziv
					&& listaValuta.get(i).getDatum() == datum) {

				novaValuta.setKupovni(listaValuta.get(i).getKupovni());
				novaValuta.setProdajni(listaValuta.get(i).getProdajni());
				novaValuta.setSrednji(listaValuta.get(i).getSrednji());
			}
		}

		if (kurs < 1 || kurs > 3) {
			System.out.println("Uneli ste pogresnu sifru kursa");
			return 0;
			
		}

		if (kurs == 1)
			return novaValuta.getKupovni();

		if (kurs == 2)
			return novaValuta.getSrednji();

		if (kurs == 1)
			return novaValuta.getProdajni();
		return kurs;


	}

	

}
