/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Avion {
	private String tipo;
	private int filas;
	private String aerolinea;
	/**
	 * 
	 */

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
	/**
	 * @return the filas
	 */
	public int getFilas() {
		return filas;
	}
	/**
	 * @param filas the filas to set
	 */
	public void setFilas(int filas) {
		this.filas = filas;
	}
	/**
	 * @return the aerolinea
	 */
	public String getAerolinea() {
		return aerolinea;
	}
	/**
	 * @param aerolinea the aerolinea to set
	 */
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	
	public Avion(String tipo, int filas, String aerolinea) {
		this.tipo = tipo;
		this.filas = filas;
		this.aerolinea = aerolinea;
	}
	@Override
	public String toString() {
		return "Avion [tipo = " + tipo + ", filas = " + filas + ", aerolinea = " + aerolinea + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Avion destruido");
	}
	
	

}
