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
	private int tama�o;
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
	public int getTama�o() {
		return tama�o;
	}
	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public Bicicleta(String tipo, int tama�o, String color) {
		this.tipo = tipo;
		this.tama�o = tama�o;
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "Bicicleta [tipo = " + tipo + ", tama�o = " + tama�o + ", color = " + color + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Bicicleta destruido");
	}
	
	
}
