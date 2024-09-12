/**
 * 
 */
package uniandes.dpoo.aerolinea.modelo;

/**
 * 
 */
public class Avion {
	
	private String nombre; 
	private int capacidad;
	
	/**
	 * 
	 */
	public Avion(String nombre, int capacidad) {
		this.capacidad = capacidad;
		this.nombre = nombre;
		
	}
	/**
	 */
	//	 Metodos getter 
	public String getNombre() {
		return nombre; 
	}
	
	public int getCapacidad(){
		return capacidad;
	}
}
