package components;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import json.JsonUtiles;

public class JavaAJson 
{
	public static void pasarAJSON(ArrayList<Aeropuerto> arrayAeropuertos)
	{
		JSONArray jsonArrayRetorno = new JSONArray();
		
		for (Aeropuerto aeropuerto : arrayAeropuertos)
		{
			try 
			{
				JSONObject jsonObjectAeropuerto = new JSONObject();
				
				JSONArray jsonArrayTags = new JSONArray();
				JSONArray jsonArrayPilotos = new JSONArray();
				
				jsonObjectAeropuerto.put("capacidad", aeropuerto.getCapacidad());
				jsonObjectAeropuerto.put("ciudad", aeropuerto.getCiudad());
				jsonObjectAeropuerto.put("clasificacion", aeropuerto.getClasificacion());
				
				for(Tag tag : aeropuerto.getTags())
				{
					jsonArrayTags.put(tag);
				}
				
				jsonObjectAeropuerto.put("tags", jsonArrayTags);
				
				jsonObjectAeropuerto.put("fechaInicio", aeropuerto.getFechaInicio());
				jsonObjectAeropuerto.put("longitude", aeropuerto.getLongitude());
				jsonObjectAeropuerto.put("activo", aeropuerto.isActivo());
				
				for(Piloto piloto : aeropuerto.getPilotos())
				{
					JSONObject jsonObjectPiloto = new JSONObject();
					jsonObjectPiloto.put("nombre", piloto.getNombre());
					jsonObjectPiloto.put("genero", piloto.getGenero());
					jsonArrayPilotos.put(jsonObjectPiloto);
				}
				
				jsonObjectAeropuerto.put("pilotos", jsonArrayPilotos);
				
				jsonObjectAeropuerto.put("latitude", aeropuerto.getLatitude());
				jsonObjectAeropuerto.put("nombre", aeropuerto.getNombre());
				
				jsonArrayRetorno.put(jsonObjectAeropuerto);
			} 
			catch (JSONException e) 
			{
				e.printStackTrace();
			}
		}
		JsonUtiles.grabar(jsonArrayRetorno);
	}
}
