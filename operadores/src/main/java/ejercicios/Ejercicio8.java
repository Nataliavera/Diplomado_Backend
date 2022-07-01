package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public Double areaCirculo(Double radio) {
		Double a = Math.PI * radio * radio;
		return a;
	}

	public Double perimetroCirculo(Double radio) {
		Double p = 2 * Math.PI * radio;
		return p;
	}

	public static void main(String[] args) {
		/*
		 * Realizar un algoritmo que muestre el área y el perímetro de un circulo
		 */
		 
		Scanner teclado = new Scanner(System.in);
		Ejercicio8 ej = new Ejercicio8();
		
		System.out.println("Ingrese el radio: ");
		Double radio = teclado.nextDouble();
		ej.areaCirculo(radio);
		ej.perimetroCirculo(radio);
	}

}
