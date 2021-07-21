package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import components.Aeropuerto;
import components.JavaAJson;
import components.ListaAeropuertos;
import components.Piloto;
import components.PilotosYTags;
import components.Tag;
import components.listaGenerica;

public class Main 
{

	public static void main(String[] args) 
	{
		// PUNTO 1:
		System.out.println("PUNTO 1: \nSe genera el .JSON en el directiorio del proyecto.");
		
		ListaAeropuertos arrayAeropuerto = new ListaAeropuertos();
		
		ArrayList<Tag> tags =  new ArrayList<Tag>();
		
		tags.add(new Tag("tag1"));
		tags.add(new Tag("tag2"));
		tags.add(new Tag("tag3"));
		
		ArrayList<Piloto> pilotos =  new ArrayList<Piloto>();
		
		pilotos.add(new Piloto("piloto1", "masculino"));
		pilotos.add(new Piloto("piloto2", "femenino"));
		pilotos.add(new Piloto("piloto3", "femenino"));
		
		Aeropuerto aeropuerto =  new Aeropuerto(38,"Austria" , "internacional", tags, "2014-01-30T08:41:01 +03:00", 123.091415, true, pilotos, -88.422213, "Quintity");
		Aeropuerto aeropuerto2 =  new Aeropuerto(10,"Austria" , "internacional", tags, "2014-01-30T08:41:01 +03:00", 123.091415, true, pilotos, -88.422213, "Quintity");
		Aeropuerto aeropuerto3 =  new Aeropuerto(5,"Austria" , "internacional", tags, "2014-01-30T08:41:01 +03:00", 123.091415, true, pilotos, -88.422213, "Quintity");
		
		arrayAeropuerto.add(aeropuerto);
		arrayAeropuerto.add(aeropuerto2);
		arrayAeropuerto.add(aeropuerto3);

		JavaAJson.pasarAJSON(arrayAeropuerto);
		
		// PUNTO 2:
		System.out.println("\n\nPunto2");

		ListaAeropuertos ListFiltradoPorCap = (ListaAeropuertos) arrayAeropuerto.getAeropuertosMayoresCap(6); // se instancia la lista que tiene el metodo para filtar por capacidad con la el resultado del filtrado.
		
		for (Aeropuerto aeropuertoFiltradoPorCap : ListFiltradoPorCap)
		{
			System.out.println("Cap: "  + aeropuertoFiltradoPorCap.getCapacidad()); // se printeaen los resultados.
		}
		
		// PUNTO 3:
		
		System.out.println("\n\nPunto3");
		
		listaGenerica<PilotosYTags> listaGenerica1 = new listaGenerica<PilotosYTags>(); // se instancia la listaGenerica.
		
		listaGenerica1.agregar(new Piloto("piloto1", "masculino"));
		listaGenerica1.agregar(new Tag("tag1"));
		listaGenerica1.agregar(new Piloto("piloto2", "femenino")); // se cargan tanto pilotos como tags
		listaGenerica1.agregar(new Piloto("piloto3", "masculino"));
		listaGenerica1.agregar(new Tag("tag1"));
		listaGenerica1.agregar(new Tag("tag3"));
		
		for (int i=0; i < listaGenerica1.tam(); i++)
		{
			if (listaGenerica1.recuperarPorPos(i) instanceof Tag)
			{
				Tag tag = (Tag) listaGenerica1.recuperarPorPos(i);
				System.out.println("Tag: " + tag.getValor());                      // testeo de la lista generica.
			}
			else
			{
				Piloto piloto = (Piloto) listaGenerica1.recuperarPorPos(i);
				System.out.println("Piloto: " + piloto.getNombre());
			}
		}
		
		// PUNTO 4:
		
		System.out.println("\n\nPunto4");
		
		HashSet<Tag> hashSet = new HashSet<Tag>();
		
		for (int i=0; i < listaGenerica1.tam(); i++) // se agregan unicamente los tags que estan en la lista generica.
		{
			if (listaGenerica1.recuperarPorPos(i) instanceof Tag)
			{
				if (hashSet.add((Tag) listaGenerica1.recuperarPorPos(i)))
				{
					System.out.println("Se agrego al HashSet el Tag");
				}
				else                                           
				{
					Tag tag = (Tag) listaGenerica1.recuperarPorPos(1);
					System.out.println("No se agrego al HashSet el Tag con valor: " + tag.getValor() +", porque ya esta en el HashSet");
				}
				
			}
		}
		
		System.out.println("HashSet de Tags: " + hashSet);
	}
}
