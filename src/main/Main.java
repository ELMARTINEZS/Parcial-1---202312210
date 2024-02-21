package main;

import logica.Persona;

import logica.Hombre;
import logica.Mujer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub+
		
		Persona hombre;
		hombre = new Hombre("Juan", 62.5, 170, 17);
		System.out.println(hombre.calcularTMB());
		
		hombre = new Hombre("Jose", 65.7, 175, 20);
		System.out.println(hombre.calcularTMB());
		
		Persona mujer;
		mujer = new Mujer ("Sofia", 50.2 , 165, 16);
		System.out.println(mujer.calcularTMB());

	}

}
