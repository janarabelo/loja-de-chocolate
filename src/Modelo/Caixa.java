package Modelo;

public class Caixa extends Chocolate
{

	private int quantCaixa;

	
	
	public Caixa(String categoria, String nome, String descricão,
			     double preco, double peso, String alergenicos,
			     int quantidade, int quantCaixa) 
	{
		super(categoria, nome, descricão, preco, peso, alergenicos,
			  quantidade);
		this.quantCaixa = quantCaixa;
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

	public String getDescricão() 
	{
		return descricão;
	}

	public void setDescricão(String descricão) 
	{
		this.descricão = descricão;
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


	public int getQuantCaixa() 
	{
		return quantCaixa;
	}

	public void setQuantCaixa(int quantCaixa) 
	{
		this.quantCaixa = quantCaixa;
	}

	
}
