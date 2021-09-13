package Modelo;

public class Cliente extends Pessoa
{
	
	private String alergia;

	
	
	public Cliente(String nome, String sobrenome, String dtNascimento,
			       String endereco, String cpf, Telefone tel, String alergia) 
	{
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dtNascimento = dtNascimento;
		this.tel = tel;
		this.alergia = alergia;
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

	public String getAlergia() 
	{
		return alergia;
	}

	public void setAlergia(String alergia) 
	{
		this.alergia = alergia;
	}
	
	
}