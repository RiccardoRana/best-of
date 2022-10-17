package com.soprasteria.bestof.classes;

import java.util.List;



public class Movie {

	private String titolo, regista;
	private int anno;
	private List<String> cast;

	public Movie(String titolo, String regista, int anno, List<String> cast) {
		super();
		this.titolo = titolo;
		this.regista = regista;
		this.anno = anno;
		this.cast = cast;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public List<String> getCast() {
		return cast;
	}

	public void setCast(List<String> cast) {
		this.cast = cast;
	}

}
