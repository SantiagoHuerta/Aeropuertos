package components;

public class Piloto implements PilotosYTags
{
	private String nombre;
	private String genero;
	
	public Piloto(String nombre, String genero) 
	{
		this.nombre = nombre;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	@Override
	public boolean equals(Object o) 
	{
		boolean retorno = false;
		if (o != null)
		{
			if (o instanceof Piloto)
			{
				Piloto piloto = (Piloto) o;
				
				if (piloto.getNombre().equals(this.nombre))
				{
					retorno = true;
				}
			}
		}
		return retorno;
	}
	
}
