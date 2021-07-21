package components;

import java.util.ArrayList;

public class ListaAeropuertos extends ArrayList<Aeropuerto>
{
	private static final long serialVersionUID = -5092010799630066179L;

	public ListaAeropuertos getAeropuertosMayoresCap(int capMin)
	{
		Object[] arrayInic = this.toArray();
		
		ListaAeropuertos arrayRetrono = new ListaAeropuertos();
		
		for (Object object : arrayInic)
		{
			Aeropuerto aeropuerto = (Aeropuerto) object;
			
			if (aeropuerto.getCapacidad() > capMin)
			{
				arrayRetrono.add(aeropuerto);
			}
			else
			{
				lanzarE(aeropuerto.getCapacidad());
			}
		}
		
		return arrayRetrono;
	}
	
	public void lanzarE(int cap)
	{
		try
		{
			throw new ExceptionCapacidad(cap);
		}
		catch (ExceptionCapacidad e1) 
		{
			System.out.println(e1.getMessage());
		}
	}
}
