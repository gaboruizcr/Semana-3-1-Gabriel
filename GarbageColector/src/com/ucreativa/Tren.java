/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Tren {
	private int cantBagones;
	private int a�o;
	private String tipo;
	/**
	 * 
	 */
	/**
	 * @return the cantBagones
	 */
	public int getCantBagones() {
		return cantBagones;
	}
	/**
	 * @param cantBagones the cantBagones to set
	 */
	public void setCantBagones(int cantBagones) {
		this.cantBagones = cantBagones;
	}
	/**
	 * @return the a�o
	 */
	public int getA�o() {
		return a�o;
	}
	/**
	 * @param a�o the a�o to set
	 */
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Tren(int cantBagones, int a�o, String tipo) {
		this.cantBagones = cantBagones;
		this.a�o = a�o;
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Tren [cantBagones = " + cantBagones + ", a�o = " + a�o + ", tipo = " + tipo + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Tren destruido");
	}
	

}
