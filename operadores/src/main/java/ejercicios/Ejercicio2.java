package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 *Elabore una clase que permita leer el nombre, el sexo, y el peso de una persona imprima los datos leídos */ 

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre: ");
		String nombre = teclado.next();
		
		System.out.println("Ingrese el sexo (F- Femenino, M- Masculino):");
		String sexo = teclado.next().toUpperCase();
		
		System.out.println("Ingrese la edad: ");
		int edad = teclado.nextInt();
		
		System.out.println("El nombre es: "+nombre+"\nSexo: "+sexo+"\nEdad: "+edad);
		
		
		teclado.close();
	}

}
