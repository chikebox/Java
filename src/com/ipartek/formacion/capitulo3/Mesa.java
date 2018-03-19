//1.Definición package
package com.ipartek.formacion.capitulo3;
//2.imports

//3. Definición de la clase
public class Mesa {
	// PRECIO EN €
	final int PRECIO_PATA = 1;
	final int PRECIO_M2 = 5;
	final int PRECIO_MATERIAL_MADERA = 4;
	final int PRECIO_MATERIAL_ACERO = 6;
	final int PRECIO_MATERIAL_ALUMINIO = 5;
	final int PRECIO_MATERIAL_PLASTICO = 2;
	final int PRECIO_COLOR_CUSTOM = 23;
	final String PRECIO_COLOR_NAME_CUSTOMS = "custom";
	final int MATERIAL_MADERA = 1;
	final int MATERIAL_ACERO = 2;
	final int MATERIAL_ALUMINIO = 3;
	final int MATERIAL_PLASTICO = 4;
	// 4.Definición de atributos
	private int numPatas;
	private int dimension; // m2
	private String color;
	private int material;

	// 5. Métodos
	// 5.1 constructores
	public Mesa() {
		super();
		this.numPatas = 4;
		this.dimension = 1;
		this.color = "blanco";
		this.material = 1;
	}

	public Mesa(int pNumPatas) {
		super();
		this.setNumPatas(pNumPatas);
		;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaterial() {
		return material;
	}

	public void setMaterial(int material) {
		this.material = material;
	}

	public Mesa(int pNumPatas, int pDimension, String pColor, int pMaterial) {
		super();
		this.setNumPatas(pNumPatas);
		this.setDimension(pDimension);
		this.setColor(pColor);
		this.setMaterial(pMaterial);
	}

	// 5.2gettes y setters
	public int getNumPatas() {
		return this.numPatas;
	}

	public void setNumPatas(int pNumPatas) {
		this.numPatas = (pNumPatas < 0) ? 0 : pNumPatas;
	}
	// 5.3 otros

	@Override
	public String toString() {
		return "Mesa [numPatas=" + numPatas + "]";
	}

	public int calcularPrecio() {
		// cálculo de las patas
		int precioPatas = this.getNumPatas() * PRECIO_PATA;
		// cálculo de la dimensión
		int precioDimension = this.getDimension() * PRECIO_M2;
		// cálculo del color
		int precioColor = 0;
		if (this.getColor().equals("custom")) {
			precioColor = PRECIO_COLOR_CUSTOM;
		}
		int precioMaterial = 0;
		switch (this.getMaterial()) {
		case 1: {
			precioMaterial = PRECIO_MATERIAL_MADERA;
			break;
		}
		case 2: {
			precioMaterial = PRECIO_MATERIAL_ACERO;
			break;
		}
		case 3: {
			precioMaterial = PRECIO_MATERIAL_ALUMINIO;
			break;
		}
		case 4: {
			precioMaterial = PRECIO_MATERIAL_PLASTICO;
			break;
		}
		}
		return precioPatas + precioDimension + precioColor + precioMaterial;
	}
}
