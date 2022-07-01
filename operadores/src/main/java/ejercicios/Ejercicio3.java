package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public Double areaCuadrado(Double lado) {
		Double areac = lado * lado;
		return areac;
	}

	public Double perimetroCuadrado(Double lado) {
		Double pec = 4 * lado;
		return pec;
	}

	public Double areaTriangulo(Double base, Double al) {
		Double at = (base * al) / 2;
		return at;
	}

	public Double perimetroTriangulo(Double l1, Double l2, Double l3) {
		Double p;
		p = l1 + l2 + l3;
		return p;
	}

	public Double areaCirculo(Double radio) {
		Double a = Math.PI * radio * radio;
		return a;
	}

	public Double perimetroCirculo(Double radio) {
		Double p = 2 * Math.PI * radio;
		return p;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Ejercicio3 ej = new Ejercicio3();

		System.out.println("Menú");
		System.out.println("1. Area cuadrado");
		System.out.println("2. Perimetro cuandrado");
		System.out.println("3. Area circulo");
		System.out.println("4. Perimetro circulo");
		System.out.println("5. Area triangulo");
		System.out.println("6. Perimetro triangulo");
		System.out.println("Introduzca una opcion:");
		int op = teclado.nextInt();

		switch (op) {
		case 1:
			System.out.println("Ingrese el lado:");
			Double lado = teclado.nextDouble();
			ej.areaCuadrado(lado);
			System.out.println("Area cuadrado: "+ej);
			break;
		case 2:
			System.out.println("Ingrese el lado:");
			Double ladop = teclado.nextDouble();
			ej.perimetroCuadrado(ladop);
			System.out.println("Perimetro cuadrado: "+ej);
			break;
		case 3:
			System.out.println("Ingrese la base:");
			Double base = teclado.nextDouble();
			System.out.println("Ingrese la altura: ");
			Double al = teclado.nextDouble();
			ej.areaTriangulo(base, al);
			System.out.println("Area triangulo: "+ej);
			break;
		case 4:
			System.out.println("Ingrese el lado:");
			Double l1 = teclado.nextDouble();
			System.out.println("Ingrese el lado:");
			Double l2 = teclado.nextDouble();
			System.out.println("Ingrese el lado:");
			Double l3 = teclado.nextDouble();
			ej.perimetroTriangulo(l1, l2, l3);
			System.out.println("Perimetro triangulo: "+ej);
			break;
		case 5:
			System.out.println("Ingrese el radio:");
			Double radio = teclado.nextDouble();
			ej.areaCirculo(radio);
			System.out.println("Area circulo: "+ej);
			break;
		case 6:
			System.out.println("Ingrese el radio:");
			Double r = teclado.nextDouble();
			ej.perimetroCirculo(r);
			System.out.println("Perimetro circulo: "+ej);
			break;
		default:
			System.out.println("La opcion ingresada no es valida");
			break;
		}

	}

}
