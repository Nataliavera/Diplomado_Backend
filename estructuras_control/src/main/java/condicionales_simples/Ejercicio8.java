package condicionales_simples;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo.*/
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa un numero: ");
		int n = teclado.nextInt();
		
		if(n > 0) {
			System.out.println("El numero es positivo");
		}else if(n < 0) {
			System.out.println("El numero es negativo");
		}else {
			System.out.println("EL numero es nulo");
		}
		
	}
}
