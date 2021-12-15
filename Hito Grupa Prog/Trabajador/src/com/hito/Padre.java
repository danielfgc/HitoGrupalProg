package com.hito;

public abstract class Padre {

	public String texto;
	public int numero;
//Constructos
	public Padre(String texto, int numero) {
		this.texto = texto;
		this.numero = numero;
	}
//Getters
	public String getTexto() {
		return texto;
	}
	public int getNumero() {
		return numero;
	}
//Setters
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
		

}
