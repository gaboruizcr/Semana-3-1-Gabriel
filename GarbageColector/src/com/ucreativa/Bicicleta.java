/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Bicicleta {
	private String tipo;
	private int tamaño;
	private String color;
	/**
	 * 
	 */
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public Bicicleta(String tipo, int tamaño, String color) {
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "Bicicleta [tipo = " + tipo + ", tamaño = " + tamaño + ", color = " + color + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Bicicleta destruido");
	}
	
	
}
