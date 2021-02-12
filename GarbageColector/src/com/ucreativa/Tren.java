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
	private int año;
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
	 * @return the año
	 */
	public int getAño() {
		return año;
	}
	/**
	 * @param año the año to set
	 */
	public void setAño(int año) {
		this.año = año;
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
	public Tren(int cantBagones, int año, String tipo) {
		this.cantBagones = cantBagones;
		this.año = año;
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Tren [cantBagones = " + cantBagones + ", año = " + año + ", tipo = " + tipo + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Tren destruido");
	}
	

}
