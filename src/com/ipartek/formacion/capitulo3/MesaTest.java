package com.ipartek.formacion.capitulo3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MesaTest {

	@Test
	public void testMesa() {
		Mesa mesa=new Mesa();
		assertTrue(4==mesa.getNumPatas());
		assertEquals(1, mesa.getDimension());
		assertEquals("blanco",mesa.getColor());
		assertEquals(Mesa.MATERIAL_MADERA,mesa.getMaterial());
	}

	@Test
	public void testMesaInt() {
		Mesa mesa1=new Mesa(1);
		assertEquals(1, mesa1.getNumPatas());
		assertEquals(1, mesa1.getDimension());
		assertEquals("blanco",mesa1.getColor());
		assertEquals(Mesa.MATERIAL_MADERA,mesa1.getMaterial());
		
		Mesa mesa2=new Mesa(-1);
		assertEquals(1, mesa2.getNumPatas());
		assertEquals(1, mesa2.getDimension());
		assertEquals("blanco",mesa2.getColor());
		assertEquals(Mesa.MATERIAL_MADERA,mesa2.getMaterial());
		
		Mesa mesa3=new Mesa(0);
		assertEquals(1, mesa3.getNumPatas());
		assertEquals(1, mesa3.getDimension());
		assertEquals("blanco",mesa3.getColor());
		assertEquals(Mesa.MATERIAL_MADERA,mesa3.getMaterial());
	}

	@Test
	public void testMesaIntIntStringInt() {
		Mesa mesa1=new Mesa(1,1,"blanco",1);
		assertEquals(1, mesa1.getNumPatas());
		assertEquals(1, mesa1.getDimension());
		assertEquals("blanco",mesa1.getColor());
		assertEquals(Mesa.MATERIAL_MADERA,mesa1.getMaterial());
		
		Mesa mesa2=new Mesa(-1,-1,"custom",5);
		assertEquals(1, mesa2.getNumPatas());
		assertEquals(0, mesa2.getDimension());
		assertEquals("custom",mesa2.getColor());
		assertEquals(Mesa.MATERIAL_MADERA,mesa2.getMaterial());
		
		Mesa mesa3=new Mesa(0,0,"",4);
		assertEquals(1, mesa3.getNumPatas());
		assertEquals(0, mesa3.getDimension());
		assertEquals("",mesa3.getColor());
		assertEquals(Mesa.MATERIAL_PLASTICO,mesa3.getMaterial());
	}

	@Test
	public void testSetNumPatas() {
		Mesa mesa=new Mesa();
		
		mesa.setNumPatas(2);
		assertTrue(2==mesa.getNumPatas());
		assertEquals(1, mesa.getDimension());
		assertEquals("blanco",mesa.getColor());
		assertEquals(Mesa.MATERIAL_MADERA,mesa.getMaterial());
		
		mesa.setNumPatas(0);
		assertTrue(1==mesa.getNumPatas());
		assertEquals(1, mesa.getDimension());
		assertEquals("blanco",mesa.getColor());
		assertEquals(Mesa.MATERIAL_MADERA,mesa.getMaterial());
		
		mesa.setNumPatas(-1);
		assertTrue(1==mesa.getNumPatas());
		assertEquals(1, mesa.getDimension());
		assertEquals("blanco",mesa.getColor());
		assertEquals(Mesa.MATERIAL_MADERA,mesa.getMaterial());
	}
	@Test
	public void testSetDimension() {
		Mesa mesa=new Mesa();
		
		mesa.setDimension(2);
		assertEquals(4, mesa.getNumPatas());
		assertEquals(2, mesa.getDimension());
		assertEquals("blanco",mesa.getColor());
		assertEquals(Mesa.MATERIAL_MADERA,mesa.getMaterial());
		
		mesa.setDimension(0);
		assertEquals(4, mesa.getNumPatas());
		assertEquals(0, mesa.getDimension());
		assertEquals("blanco",mesa.getColor());
		assertEquals(Mesa.MATERIAL_MADERA,mesa.getMaterial());
		
		mesa.setDimension(-1);
		assertEquals(4, mesa.getNumPatas());
		assertEquals(0, mesa.getDimension());
		assertEquals("blanco",mesa.getColor());
		assertEquals(Mesa.MATERIAL_MADERA,mesa.getMaterial());
	}
	@Test
	public void testCalcularPrecio() {
		Mesa mesa1=new Mesa();
		assertEquals(4*mesa1.PRECIO_PATA+1*mesa1.PRECIO_M2*mesa1.PRECIO_MATERIAL_MADERA,mesa1.calcularPrecio());
		
		Mesa mesa2=new Mesa(1);
		assertEquals(1*mesa1.PRECIO_PATA+1*mesa1.PRECIO_M2*mesa1.PRECIO_MATERIAL_MADERA,mesa1.calcularPrecio(),mesa2.calcularPrecio());
		
		Mesa mesa3=new Mesa(1,1,"blanco",1);
		assertEquals(1*mesa3.PRECIO_PATA+1*mesa3.PRECIO_M2*mesa3.PRECIO_MATERIAL_MADERA,mesa3.calcularPrecio());
		
		Mesa mesa4=new Mesa(-1,-1,"custom",5);
		assertEquals(0,mesa4.calcularPrecio());
		
		Mesa mesa5=new Mesa(0,0,"",4);
		assertEquals(0,mesa5.calcularPrecio());
		
		Mesa mesa6=new Mesa(3,5,"blanco",2);
		assertEquals(3*mesa3.PRECIO_PATA+5*mesa3.PRECIO_M2*mesa3.PRECIO_MATERIAL_ACERO,mesa6.calcularPrecio());
		
		Mesa mesa7=new Mesa(3,5,"custom",4);
		assertEquals(3*mesa3.PRECIO_PATA+5*mesa3.PRECIO_M2*mesa3.PRECIO_MATERIAL_PLASTICO+mesa7.PRECIO_COLOR_CUSTOM,mesa7.calcularPrecio());
		
		
	}

}
