package hr.osobe.main;

import java.util.ArrayList;
import java.util.List;

import hr.osob.model.Osoba;

public class OsobeMain {

	public static void main(String[] args) {

		List<Osoba> popis = new ArrayList<Osoba>();

		Osoba osoba1 = new Osoba("Ivan", "Tadic", "0914692858");
		Osoba osoba2 = new Osoba("Marko", "Markic", "0984692858");
		Osoba osoba3 = new Osoba("Jure", "Juric", "0954692858");
		Osoba osoba4 = new Osoba("Ivan", "Jozic", "0924692858");
		Osoba osoba5 = new Osoba("Marina", "Marinic", "091469285");
		Osoba osoba6 = new Osoba("Ivan", "Ivic", "098878587");
		Osoba osoba7 = new Osoba("Marija", "Marijic", "015898754");

		popis.add(osoba1);
		popis.add(osoba2);
		popis.add(osoba3);
		popis.add(osoba4);
		popis.add(osoba5);
		popis.add(osoba6);
		popis.add(osoba7);

	
		//find all persons with name "Ivan"
		for (Osoba osoba : popis) {

			if (osoba.getIme().contains("Ivan"))
		
				System.out.println(osoba);
		}

	}

}
