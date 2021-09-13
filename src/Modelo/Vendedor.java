package Modelo;

public class Vendedor extends Pessoa
{

	private double salario;
	private double comissao;
	
	
	
	public Vendedor(String nome, String sobrenome, String dtNascimento,
		            String endereco, String cpf, Telefone tel,
		            double salario, double comissao) 
	{
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dtNascimento = dtNascimento;
		this.tel = tel;
		this.salario = salario;
		this.comissao = comissao;
	}
	
	
	public String getNome() 
	{
		return super.getNome();
	}

	public void setNome(String nome) 
	{
		super.setNome(nome);
	}

	public String getSobrenome() 
	{
		return super.getSobrenome();
	}

	public void setSobrenome(String sobrenome) 
	{
		super.setSobrenome(sobrenome);
	}

	public String getDtNascimento() 
	{
		return super.getDtNascimento();
	}

	public void setDtNascimento(String dtNascimento) 
	{
		super.setDtNascimento(dtNascimento);
	}
	
	public String getEndereco() 
	{
		return super.getEndereco();
	}

	public void setEndereco(String endereco) 
	{
		super.setEndereco(endereco);
	}

	public String getCpf()
	{
		return super.getCpf();
	}

	public void setCpf(String cpf) 
	{
		super.setCpf(cpf);
	}

	public Telefone getTel() 
	{
		return super.getTel();
	}

	public void setTel(Telefone tel) 
	{
		super.setTel(tel);
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getComissao() 
	{
		return comissao;
	}

	public void setComissao(double comissao) 
	{
		this.comissao = comissao;
	}
	
	
}
