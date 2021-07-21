package components;

import java.util.ArrayList;

public class Aeropuerto 
{
	private int capacidad;
	private String ciudad;
	private String clasificacion;
	private ArrayList<Tag> tags;
	private String fechaInicio;
	private Double longitude;
	private boolean activo;
	private ArrayList<Piloto> pilotos;
	private Double latitude;
	private String nombre;
	
	public Aeropuerto(int capacidad, String ciudad, String clasificacion, ArrayList<Tag> tags, String fechaInicio,
			Double longitude, boolean activo, ArrayList<Piloto> pilotos, Double latitude, String nombre) 
	{
		this.capacidad = capacidad;
		this.ciudad = ciudad;
		this.clasificacion = clasificacion;
		this.tags = tags;
		this.fechaInicio = fechaInicio;
		this.longitude = longitude;
		this.activo = activo;
		this.pilotos = pilotos;
		this.latitude = latitude;
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public ArrayList<Tag> getTags() {
		return tags;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public Double getLongitude() {
		return longitude;
	}

	public boolean isActivo() {
		return activo;
	}

	public ArrayList<Piloto> getPilotos() {
		return pilotos;
	}

	public Double getLatitude() {
		return latitude;
	}

	public String getNombre() 
	{
		return nombre;
	}

	
}
