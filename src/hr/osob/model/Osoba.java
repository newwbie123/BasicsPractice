package hr.osob.model;

public class Osoba {
	
	private String ime;
	private String prezime;
	private String brojTelefona;
	
	
	public Osoba(String ime, String prezime, String brojTelefona) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brojTelefona = brojTelefona;
	}

	



	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public String getBrojTelefona() {
		return brojTelefona;
	}


	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}


	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", brojTelefona=" + brojTelefona + "]";
	}


	
	
	
	

}
