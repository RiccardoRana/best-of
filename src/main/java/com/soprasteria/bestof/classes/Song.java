package com.soprasteria.bestof.classes;



public class Song {

	private String Titolo, Genere, Autore, Performer;
	private int anno;

	public Song(String titolo, String genere, String autore, String performer, int anno) {
		super();
		Titolo = titolo;
		Genere = genere;
		Autore = autore;
		Performer = performer;
		this.anno = anno;
	}

	public String getTitolo() {
		return Titolo;
	}

	public void setTitolo(String titolo) {
		Titolo = titolo;
	}

	public String getGenere() {
		return Genere;
	}

	public void setGenere(String genere) {
		Genere = genere;
	}

	public String getAutore() {
		return Autore;
	}

	public void setAutore(String autore) {
		Autore = autore;
	}

	public String getPerformer() {
		return Performer;
	}

	public void setPerformer(String performer) {
		Performer = performer;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

}
