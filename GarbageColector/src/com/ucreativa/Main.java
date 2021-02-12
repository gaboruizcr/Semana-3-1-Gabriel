/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Bicicleta bici1 = new Bicicleta("Pista", 30, "Negra");
		Bicicleta bici2 = new Bicicleta("Montañera", 22, "Verde");
		
		System.out.println("Instancia 1");
		System.out.println(bici1.toString());
		System.out.println("===============");
		
		bici1 = null;
		System.gc();
		System.out.println("========END Inst1=======");
		
		System.out.println("Instancia 2");
		System.out.println(bici2.toString());
		System.out.println("===============");
		bici2 = null;
		System.gc();
		System.out.println("========END Inst2=======");
		
		Barco barco1 = new Barco("grande", "negro", "Pinta");
		
		System.out.println("Instancia 3");
		System.out.println(barco1.toString());
		System.out.println("===============");
		barco1 = null;
		System.gc();
		System.out.println("========END Inst3=======");
		
		
		Avion avion1 = new Avion("Comercial", 6, "Delta");
		
		System.out.println("Instancia 4");
		System.out.println(avion1.toString());
		System.out.println("===============");
		avion1 = null;
		System.gc();
		System.out.println("========END Inst4=======");
		
		Carro carro1 = new Carro("Volkswagen", 2004, "Jetta");
		
		System.out.println("Instancia 5");
		System.out.println(carro1.toString());
		System.out.println("===============");
		carro1 = null;
		System.gc();
		System.out.println("========END Inst5=======");
		
		Tren tren1 = new Tren(3, 2015, "electrico");
		
		System.out.println("Instancia 6");
		System.out.println(tren1.toString());
		System.out.println("===============");
		tren1 = null;
		System.gc();
		System.out.println("========END Inst6=======");

	}

}
