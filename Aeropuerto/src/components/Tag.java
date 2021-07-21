package components;

public class Tag implements PilotosYTags
{
	private String valor;

	public Tag(String valor) 
	{
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public boolean equals(Object o) 
	{
		boolean retorno = false;
		if (o != null)
		{
			if (o instanceof Tag)
			{
				Tag tag = (Tag) o;
				
				if (tag.getValor().equals(this.valor))
				{
					retorno = true;
				}
			}
		}
		return retorno;
	}
	
	@Override
	public int hashCode() 
	{
		return 1;
	}

	@Override
	public String toString() 
	{
		return getValor();
	}
		
}
