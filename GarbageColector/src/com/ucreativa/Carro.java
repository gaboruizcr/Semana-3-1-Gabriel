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
	private int a�o;
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
	public Carro(String marca, int a�o, String modelo) {
		this.marca = marca;
		this.a�o = a�o;
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Carro [marca = " + marca + ", a�o = " + a�o + ", modelo = " + modelo + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Carro destruido");
	}
	
	

}
