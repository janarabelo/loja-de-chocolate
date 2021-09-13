package Modelo;

public class Dado
{
	
	private Cliente[] cliente = new Cliente[50];
	private Vendedor[] vendedor = new Vendedor[50];
	private Telefone[] tel = new Telefone[50];
	private Barra[] barra = new Barra[50];
	private Bolo[] bolo = new Bolo[50];
	private Caixa[] caixa = new Caixa[50];
	private Trufa[] trufa = new Trufa[50];

	
	
	public void dadosPreCadastrados()
	{
		
		for(int i = 0; i < 5; i++) 
		{
			tel[i] = new Telefone((i+1)*100, (i+1)*1000000);
			
			cliente[i] = new Cliente("Cli", "ente" + i, "Data"+ i,
					                 "Endereço" + i, "CPF" + i, tel[i],
					                 "Alergia" + i);
			
			vendedor[i] = new Vendedor("Vend", "edor" + i, "Data" + i,
									   "Endereço" + i, "CPF" + i, tel[i], 3000,
									   i * 5);
				
			barra[i] = new Barra("Barra", "Barra" + i, "Descrição" + i, 20, 200,
					              "Alergia" + i, i + 2, "Porcentagem" + i);
			
			bolo[i] = new Bolo("Bolo", "Bolo" + i, "Descrição" + i, 20, 200,
                               "Alergia" + i, i + 2, "Recheio" + i, 
                               "Cobertura" + i);
			
			caixa[i] = new Caixa("Bolo", "Bolo" + i, "Descrição" + i, 20, 200,
                                 "Alergia" + i, i + 2, 5 + i);
			
			trufa[i] = new Trufa("Bolo", "Bolo" + i, "Descrição" + i, 20, 200,
                                 "Alergia" + i, i + 2, "Sabor" + i);
			
		}
	}

	public Cliente[] getCliente() 
	{
		return cliente;
	}

	public void setCliente(Cliente[] cliente) 
	{
		this.cliente = cliente;
	}

	public Vendedor[] getVendedor() 
	{
		return vendedor;
	}

	public void setVendedor(Vendedor[] vendedor) 
	{
		this.vendedor = vendedor;
	}

	public Telefone[] getTel() 
	{
		return tel;
	}

	public void setTel(Telefone[] tel) 
	{
		this.tel = tel;
	}

	public Barra[] getBarra() 
	{
		return barra;
	}

	public void setBarra(Barra[] barra) 
	{
		this.barra = barra;
	}

	public Bolo[] getBolo() 
	{
		return bolo;
	}

	public void setBolo(Bolo[] bolo) 
	{
		this.bolo = bolo;
	}

	public Caixa[] getCaixa() 
	{
		return caixa;
	}
	
	public void setCaixa(Caixa[] caixa) 
	{
		this.caixa = caixa;
	}

	public Trufa[] getTrufa() 
	{
		return trufa;
	}

	public void setTrufa(Trufa[] trufa) 
	{
		this.trufa = trufa;
	}
	

}
