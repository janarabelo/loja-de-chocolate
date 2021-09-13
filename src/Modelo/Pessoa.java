package Modelo;

public abstract class Pessoa 
{

	protected String nome; 
	protected String sobrenome;
	protected String dtNascimento;
	protected String endereco;
	protected String cpf;
	protected Telefone tel;
	
	
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getSobrenome() 
	{
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}
	
	public String getDtNascimento() 
	{
		return dtNascimento;
	}
	
	public void setDtNascimento(String dtNascimento)
	{
		this.dtNascimento = dtNascimento;
	}
	
	public String getEndereco() 
	{
		return endereco;
	}
	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	
	public String getCpf() 
	{
		return cpf;
	}
	
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	public Telefone getTel() {
		return tel;
	}

	public void setTel(Telefone tel) {
		this.tel = tel;
	}
	
	
	
}
