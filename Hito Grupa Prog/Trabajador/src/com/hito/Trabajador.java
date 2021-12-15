//Cuestion 1
package com.hito;

public class Trabajador {

	String nombre;
	String ciudad;
	float salarioBruto;
	boolean contratoTemporal;
	
// Constructor
	
	public Trabajador(String nombre, String ciudad, float salarioBruto, boolean contratoTemporal) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.salarioBruto = salarioBruto;
		this.contratoTemporal = contratoTemporal;
	}
//Getters
	public String getNombre() {
		return nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public float getSalarioBruto() {
		return salarioBruto;
	}
//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public void setContratoTemporal(boolean contratoTemporal) {
		this.contratoTemporal = contratoTemporal;
	}
//Booleano
	public boolean isContratoTemporal() {
		return contratoTemporal;
	}
	@Override
	public String toString(){
		return "Ficha del trabajador[nombre="+ nombre + ", ciudad=" + ciudad + ", salarioBruto =" + salarioBruto +", contratoTemporal=" + contratoTemporal +"]";
	}
	
	
}//cierra llave
