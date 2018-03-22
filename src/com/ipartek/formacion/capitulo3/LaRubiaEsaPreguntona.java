package com.ipartek.formacion.capitulo3;

import java.util.Scanner;

public class LaRubiaEsaPreguntona {
	public static void main(String[] args) {
		 Hamburguesa hamburguesa=new Hamburguesa();
		 Scanner sc= new Scanner(System.in);
		 boolean[] ingredientes= new boolean[4];
		 System.out.println("Hola hermoso, de qué quieres la pechu... ¿digo la hamburguesa?");
		 
		 for(int i=0;i<Hamburguesa.ingredientes.length;i++) {
			 System.out.println("¿Quieres "+Hamburguesa.ingredientes[i]+"?(si o no)");
			 String respuesta=sc.next();
			 while((!respuesta.equals("si")&&!respuesta.equals("no"))) {
				 System.out.println("Debes decirme si o no con minúscula, no me gusta que me chillen, por favor.");
				 System.out.println("¿Quieres "+Hamburguesa.ingredientes[i]+"?");
				 respuesta=sc.next();
			 }
			 
			 if(respuesta.equals("si")) {
				 ingredientes[i]=true;
			 }
			 else if(respuesta.equals("no")){
				 ingredientes[i]=false;
			 }
		 }
		 
		 sc.close();
		 hamburguesa.setIngredientesHamburguesa(ingredientes);
		 String cadena="Su precio por una hamburguesa con: ";
		 for(int i=0;i<hamburguesa.getIngredientesHamburguesa().length;i++) {
			 
			 if(hamburguesa.getIngredientesHamburguesa()[i]) {
				 cadena+=Hamburguesa.ingredientes[i]+", ";
			 }
			 
		 }
		 cadena += "pan y carne ";
		 System.out.println(cadena+"es de "+hamburguesa.calcularPrecio()+"€");
	}
}
