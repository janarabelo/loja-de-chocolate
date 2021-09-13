package Modelo;

public class Venda 
{

	private Cliente[] cliente;
	private Vendedor[] vendedor;
	private Barra[] barra;
	private Bolo[] bolo;
	private Caixa[] caixa;
	private Trufa[] trufa;
	private int quantidade;
	private double valorTotal;
	private double desconto;
	private String pagamento;
	
	
	
	public Venda(Cliente[] cliente, Vendedor[] vendedor, Barra[] barra,
			     Bolo[] bolo, Caixa[] caixa, Trufa[] trufa,int quantidade,
			     double valorTotal, double desconto, String pagamento) 
	{
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.barra = barra;
		this.bolo = bolo;
		this.caixa = caixa;
		this.trufa = trufa;
		this.quantidade = quantidade;
		this.valorTotal = valorTotal;
		this.desconto = desconto;
		this.pagamento = pagamento;
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

	public int getQuantidade() 
	{
		return quantidade;
	}

	public void setQuantidade(int quantidade) 
	{
		this.quantidade = quantidade;
	}

	public double getValorTotal() 
	{
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) 
	{
		this.valorTotal = valorTotal;
	}

	public double getDesconto() 
	{
		return desconto;
	}

	public void setDesconto(double desconto) 
	{
		this.desconto = desconto;
	}

	public String getPagamento() 
	{
		return pagamento;
	}

	public void setPagamento(String pagamento) 
	{
		this.pagamento = pagamento;
	}
	
	
}
