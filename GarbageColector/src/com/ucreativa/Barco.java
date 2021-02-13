/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Barco {
	private String tamaño;
	private String color;
	private String nombre;

	/**
	 * 
	 */


	/**
	 * @return the tamaño
	 */
	public String getTamaño() {
		return tamaño;
	}

	/**
	 * @param tamaño the tamaño to set
	 */
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
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

	public Barco(String tamaño, String color, String nombre) {
		this.tamaño = tamaño;
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
		return "Barco [tamaño = " + tamaño + ", color = " + color + ", nombre = " + nombre + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Barco destruido");
	}
	
	

}
