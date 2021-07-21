package components;

import java.util.ArrayList;

public class listaGenerica <T>
{
	private ArrayList<T> listaGenerica;
	private int tam;
	
	public listaGenerica()
	{
		this.listaGenerica = new ArrayList<T>();
		this.tam = 0;
	}
	
	public void agregar(T t)
	{
		this.listaGenerica.add(t);
		this.tam = this.tam + 1;
	}
	
	public void borrar(T t)
	{
		if (this.tam > 0)
		{
			this.listaGenerica.remove(t);
			this.tam = this.tam - 1;
		}
	}
	
	public T recuperarPorPos(int i)
	{
		return this.listaGenerica.get(i);
	}
	
	public int tam()
	{
		return this.tam;
	}
}
