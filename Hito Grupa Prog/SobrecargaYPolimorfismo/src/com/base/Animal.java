package com.base;

public abstract class Animal {//no se puede crear un objeto Animal.
	//una clase abstract NO puede instanciarse, no puedes hacer new

	//modificadores de acceso : public, protected, private
	public void correr() {
		System.out.println("animal corriendo");
	}
	//tipo de retorno de un m�todo void, String
	public String saltar() {
		return "animal saltando";
	}
	protected void proteger() {
		System.out.println("animal protegido");
		
	}
	//m�todo privado que �nicamente se usa en su clase.
	//subrayado en amarillo porque NO se est� usando
	private void comer() {
		System.out.println("comer en privado");
	}
}//cierra clase
