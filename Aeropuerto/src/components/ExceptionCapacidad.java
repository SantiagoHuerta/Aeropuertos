package components;

public class ExceptionCapacidad extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	private int capacidadAeropuerto;
	
	public ExceptionCapacidad(int capacidadAeropuerto)
	{
		super("La capacidad: " + capacidadAeropuerto + " es menor a la requerida para ingresar este aeropuerto al arreglo de retorno");
		this.capacidadAeropuerto = capacidadAeropuerto;
	}

	public int getCapacidadAeropuerto() {
		return capacidadAeropuerto;
	}

}
