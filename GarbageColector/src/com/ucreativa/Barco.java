/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Barco {
	private String tama�o;
	private String color;
	private String nombre;

	/**
	 * 
	 */


	/**
	 * @return the tama�o
	 */
	public String getTama�o() {
		return tama�o;
	}

	/**
	 * @param tama�o the tama�o to set
	 */
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Barco(String tama�o, String color, String nombre) {
		this.tama�o = tama�o;
		this.color = color;
		this.nombre = nombre;
	}
	
	/**
	 * Este metodo sirve para que el barco flote
	 */
	public void flote() {}
	
	/**
	 * Este metodo sirve para que el barco ancle
	 */
	public void anclaje() {}

	@Override
	public String toString() {
		return "Barco [tama�o = " + tama�o + ", color = " + color + ", nombre = " + nombre + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Barco destruido");
	}
	
	

}
