package dominio;

import java.util.ArrayList;
import java.util.HashSet;

public class Mapa {

	private String nombre;
	private Integer cantidadDeVehiculos;
	private Boolean coalicion; // union

	private ArrayList<Vehiculo> vehiculos;

	public Mapa(String nombre) {
		this.nombre = nombre;
		this.cantidadDeVehiculos = 0;
		this.coalicion = false;
		this.vehiculos = new ArrayList<Vehiculo>();
	}

	public Object getCantidadDeVehiculos() {
		return cantidadDeVehiculos;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		//this.vehiculos.add(vehiculo);
		if (this.vehiculos.add(vehiculo))
			cantidadDeVehiculos++;

	}

	public /*Object*/ Boolean hayCoalicion() {
		HashSet<Vehiculo> vehiculoCopia = new HashSet<Vehiculo>();
		vehiculoCopia.addAll(vehiculos);
		if(vehiculoCopia.size() < vehiculos.size())
			coalicion = true;
		
		
		return coalicion;
	}

}
