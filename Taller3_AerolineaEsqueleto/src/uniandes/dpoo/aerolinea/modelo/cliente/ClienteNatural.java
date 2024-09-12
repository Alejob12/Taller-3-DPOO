package uniandes.dpoo.aerolinea.modelo.cliente;
import uniandes.dpoo.aerolinea.tiquetes.*;

import java.util.UUID;

public class ClienteNatural extends Cliente {
    public static final String NATURAL = "Natural";
    private String nombre;
    private String identificador; 
    
    
    public ClienteNatural(String nombre) {
        super();
        this.setNombre(nombre);
        this.identificador = UUID.randomUUID().toString();     
        }
    
    public String getTipoCliente() {
        return NATURAL;
    }
    
    public String getIdentificador() {
        return identificador;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}