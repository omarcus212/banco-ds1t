package br.senai.sp.jandira.model;

public class Cliente {
	
	private String nome;
	private String email;
	private Double salario;
	
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
	}

	
	public void Setemail(String email) {
		this.email = email;
	}
	
	public String Getemail() {
		return email;
	}
	
    public void setsalario(double salario) {
    	
       this.salario = salario;
    }
	
    public double Getsalario() {
    	return salario;
    }
	
	
	
	
	
}
