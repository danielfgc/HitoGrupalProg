package com.hito;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trabajador trabajador1=new Trabajador("Juan","Madrid",125.520f,true);
		System.out.println(trabajador1.toString());
		
		Hija hija=new Hija("Hola", 1);
		System.out.println("Hija saludando");
	}

}
