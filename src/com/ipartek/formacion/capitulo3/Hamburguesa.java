package com.ipartek.formacion.capitulo3;

public class Hamburguesa {
	static final String[] ingredientes={"tomate","lechuga","pepino","queso"};
	static final float[] precios={(float)0.5,(float)0.25,(float)0.3,(float)0.70};
	static final boolean[] basica={false,false,false,false};
	private boolean[] ingredientesHamburguesa=new boolean[ingredientes.length];
	
	public Hamburguesa(){
		this.setIngredientesHamburguesa(basica);	
	}
	
	public boolean[] getIngredientesHamburguesa() {
		return ingredientesHamburguesa;
	}
	
	public void setIngredientesHamburguesa(boolean[] ingredientesHamburguesa) {
		this.ingredientesHamburguesa = ingredientesHamburguesa;
	}
	
	public float calcularPrecio() {
		float precio=(float) 1.0;
		
		for(int i=0;i<this.getIngredientesHamburguesa().length;i++) {
			
			if(this.getIngredientesHamburguesa()[i]==true) {
				precio+=precios[i];
			}
		}
		
		return precio;
	}
}
