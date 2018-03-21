package com.ipartek.formacion.capitulo3;

import java.util.Scanner;

public class CreadorMesa {

	public static void main(String[] args) {
		System.out.println("Configurador de mesas");
		System.out.println("-----------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("¿ Numero de patas ? ");
		int patas= sc.nextInt();		
		System.out.println("¿ Color ? ");
		String color= sc.next();
		System.out.println("¿ Dimensiones ?(en metros cuadrados enteros) ");
		int dimension=sc.nextInt();
		System.out.println("¿ Material ?(1=madera, 2=acero, 3=aluminio , 4=plástico) ");
		int material=sc.nextInt();
		System.out.println("-----------------------------------------");
		System.out.println("Resumen");
		System.out.println("-------------------------------------");
		System.out.println("Patas:"+patas);
		System.out.println("Color:"+color);
		System.out.println("Metros cuadrados:"+ dimension);
		switch(material) {
		case 1:{
			System.out.println("Material: Madera");
			break;
		}
		case 2:{
			System.out.println("Material: Acero");
			break;
		}
		case 3:{
			System.out.println("Material: aluminio");
			break;
		}
		case 4:{
			System.out.println("Material: plastico");
			break;
		}
		}
		sc.close();
		Mesa mesa= new Mesa(patas,dimension,color,material);
		System.out.println("Precio:"+mesa.calcularPrecio()+"€");

	}

}
