package com.base;

public class Gato extends Animal {

	//override - sobreescritura : m�todo en la clase hija que sobreescribe el m�todo de la padre
	//firma del m�todo en java : nombre + argumentos *NO el tipo de retorno
	public void correr() {
		System.out.println("gato corriendo");
	}
	public void correr(int numero) {
		
		System.out.println("importe total de factura");
		System.out.println(numero);
	}
	//sobrecarga
	public String correr(String lugar) {//firma : nombre+argumentos =>diferente al anterior
		return "el gato corre por el "+lugar;
	}
	
}
