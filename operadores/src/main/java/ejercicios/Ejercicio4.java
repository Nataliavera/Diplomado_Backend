package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Elabore una clase que me permita resolver cualquier ecuación cuadrática propuesta por un usuario.*/
		
		Scanner teclado = new Scanner(System.in);
		Double a, b, c, x , x1, x2; 
		
		System.out.println("Ingrese el valor de a: ");
		a = teclado.nextDouble();
		
		System.out.println("Ingrese el valor de b: ");
		b = teclado.nextDouble();
		
		System.out.println("Ingrese el valor de c: ");
		c= teclado.nextDouble();
		
		x = (b * b) - 4 *a *c; 
		
		if(x <0) {
			System.out.println("Sin solucion");
		}else {
			x1 = (-b + Math.sqrt(x))/2*a;
			x2 = (-b - Math.sqrt(x))/2*a;
			System.out.println(x1);
			System.out.println(x2);
		}
		
		
	}

}
