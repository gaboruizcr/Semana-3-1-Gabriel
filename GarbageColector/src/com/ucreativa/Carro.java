/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Carro {
	private String marca;
	private int año;
	private String modelo;
	/**
	 * 
	 */

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
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
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Carro(String marca, int año, String modelo) {
		this.marca = marca;
		this.año = año;
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Carro [marca = " + marca + ", año = " + año + ", modelo = " + modelo + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Carro destruido");
	}
	
	

}
