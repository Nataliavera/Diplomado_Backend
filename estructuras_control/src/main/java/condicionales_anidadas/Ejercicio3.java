package condicionales_anidadas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma y diferencia, en caso contrario informar el producto y la división del primero respecto al segundo.*/
		
		Scanner teclado = new Scanner(System.in);
		int n1, n2; 
		
		System.out.println("Ingrese el primer numero: ");
		n1 = teclado.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		n2 = teclado.nextInt();
		
		if(n1 > n2) {
			int suma = n1 + n2; 
			int resta = n1 -n2; 
			
			System.out.println("La suma es:"+suma);
			System.out.println("La resta es:"+resta);
		}else {
			float d = n2 /n1; 
			int m = n2* n1; 
			System.out.println("La multiplicacion es: "+m);
			System.out.println("La division es: "+d);
		}
		
	}
}
