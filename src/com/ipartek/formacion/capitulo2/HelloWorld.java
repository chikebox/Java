package com.ipartek.formacion.capitulo2;

import java.util.Scanner;

public class HelloWorld {
	private static Scanner scanner;

	public static void main(String[] args) {
		String saludo = "Hola mundo, ";
		System.out.print(saludo + "dime tu nombre, o te mato jajajaja :D : ");
		scanner = new Scanner(System.in);
		String nombre = scanner.next();
		System.out.println("Hola " + nombre);
	}

}
