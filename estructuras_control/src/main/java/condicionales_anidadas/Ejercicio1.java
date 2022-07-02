package condicionales_anidadas;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos.*/
		
		Scanner teclado = new Scanner(System .in);
		
		System.out.println("Ingrese su salario:");
		int salario = teclado.nextInt();
		
		if(salario <= 3000) {
			System.out.println("No debe abonar impuestos");
		}else {
			System.out.println("Debe abonar impuesto porque su salario es mayor a 3000");
		}
	}
}
