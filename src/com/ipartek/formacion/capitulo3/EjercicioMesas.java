package com.ipartek.formacion.capitulo3;

public class EjercicioMesas {
	public static void main(String[] args) {
		Mesa mesa1 = new Mesa();
		Mesa mesa2 = new Mesa(3);
		mesa1.setNumPatas(8);
		Mesa mesa3 = new Mesa(-3);
		System.out.println("Listado de mesas");
		System.out.println("--------------------------");
		System.out.println(mesa1.toString());
		System.out.println(mesa2.toString());
		System.out.println(mesa3.toString());
		Mesa mIzaskun = new Mesa(8, 6, "negro", 1);
		Mesa mMikel = new Mesa(2, 5, "verde", 1);
		Mesa mAingeru = new Mesa(5, 7, "plateado", 2);
		Mesa mJoseba = new Mesa(3, 5, "amarillo", 3);
		Mesa mAnder = new Mesa(1, 2, "custom", 4);
		System.out.println(mIzaskun.calcularPrecio());
		System.out.println(mMikel.calcularPrecio());
		System.out.println(mAingeru.calcularPrecio());
		System.out.println(mJoseba.calcularPrecio());
		System.out.println(mAnder.calcularPrecio());
	}

}
