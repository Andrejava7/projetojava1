package curso_java_andre;

import java.util.Date;

public class pessoa {
	
	private String nome;
	
	private String sobrenome;
	
	private int idade;
	
    private Date Nascimento;
    
    private DateCadastro

	public Date getNascimento() {
		return Nascimento;
	}

	public void setNascimento(Date nascimento) {
		Nascimento = nascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	

}
