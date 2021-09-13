package Modelo;

public class Chocolate 
{

	protected String categoria;
	protected String nome;
	protected String descric�o;
	protected double preco;
	protected double peso;
	protected String alergenicos; 
	protected int quantidade;
	
	
	
	public Chocolate(String categoria, String nome, String descric�o, 
			         double preco, double peso, String alergenicos,
			         int quantidade) 
	{
		super();
		this.categoria = categoria;
		this.nome = nome;
		this.descric�o = descric�o;
		this.preco = preco;
		this.peso = peso;
		this.alergenicos = alergenicos;
		this.quantidade = quantidade;
	}



	public String getCategoria() 
	{
		return categoria;
	}

	public void setCategoria(String categoria)
	{
		this.categoria = categoria;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getDescric�o() 
	{
		return descric�o;
	}

	public void setDescric�o(String descric�o) 
	{
		this.descric�o = descric�o;
	}

	public double getPreco() 
	{
		return preco;
	}

	public void setPreco(double preco) 
	{
		this.preco = preco;
	}

	public double getPeso() 
	{
		return peso;
	}

	public void setPeso(double peso) 
	{
		this.peso = peso;
	}

	public String getAlergenicos() 
	{
		return alergenicos;
	}

	public void setAlergenicos(String alergenicos) 
	{
		this.alergenicos = alergenicos;
	}

	public int getQuantidade() 
	{
		return quantidade;
	}

	public void setQuantidade(int quantidade) 
	{
		this.quantidade = quantidade;
	}

	
}

