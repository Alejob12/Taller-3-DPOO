package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;

public class Vuelo {
	private String fecha;
    private Ruta ruta;
    private String getFecha;
    private Avion avion;
    private Collection<Tiquete> tiquetes;
    private CalculadoraTarifas calculadora;
    private int cantidad;
    
 
	

    public Vuelo(String fecha, Ruta ruta, Avion avion) {
        this.fecha = fecha;
        this.ruta = ruta;
        this.avion = avion;
        this.tiquetes = new ArrayList<>();
        this.calculadora = new CalculadoraTarifas();
        this.cantidad = 0;       
}
    public String getFecha() {
        return fecha;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public String getGetFecha() {
        return getFecha;
    }

    public Avion getAvion() {
        return avion;
    }

    public Collection<Tiquete> getTiquetes() {
        return tiquetes;
    }
    
    
}