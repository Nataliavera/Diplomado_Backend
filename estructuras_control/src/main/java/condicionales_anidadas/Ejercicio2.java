package condicionales_anidadas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que solicite ingresar dos números distintos y muestre por pantalla el mayor de ellos.*/
		
		Scanner teclado = new Scanner(System.in);
		int n1, n2; 
		
		System.out.println("Ingrese un numero: ");
		n1 = teclado.nextInt(); 
		
		System.out.println("Ingrese un numero: ");
		n2 = teclado.nextInt();
		
		while(n2 == n1) {
			System.out.println("Debe ingresar nuevamente el segundo numero");
			n2 = teclado.nextInt();
		}
	}
}
