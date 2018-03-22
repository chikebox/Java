package com.ipartek.formacion.capitulo3;

import static org.junit.Assert.*;

import org.junit.Test;

public class HamburguesaTest {
	float precio=1;
	@Test
	public void calcularPrecioTest() {
		Hamburguesa hamburguesa= new Hamburguesa();
		assertTrue(this.precio == hamburguesa.calcularPrecio());
		
		boolean[] ingredientes = {true,false,false,false};
		hamburguesa.setIngredientesHamburguesa(ingredientes);
		this.precio+=0.50;
		assertEquals(this.precio, hamburguesa.calcularPrecio(),0);
		
		
		boolean[] ingredientes2 = {true,true,false,false};
		this.precio+=0.25;
		hamburguesa.setIngredientesHamburguesa(ingredientes2);
		assertEquals(this.precio, hamburguesa.calcularPrecio(),0);
		
		boolean[] ingredientes3 = {true,true,true,false};
		this.precio+=0.3;
		hamburguesa.setIngredientesHamburguesa(ingredientes3);
		assertEquals(this.precio, hamburguesa.calcularPrecio(),0);
		
		boolean[] ingredientes4 = {true,true,true,true};
		this.precio+=0.70;
		hamburguesa.setIngredientesHamburguesa(ingredientes4);
		assertEquals(this.precio, hamburguesa.calcularPrecio(),0);
	}

}
