package br.senai.sp.jandira.model;

public class Conta {
	
	public String tipo;
	private String numero;
	public String numeroAgencia;
	public String titular;
    private double saldo;
    
       //metedo conStrutor, tem o padrao j�, mas se eu criar o java vai usar oq construtor que eu criei 
      // oq � o construtor? = " NEW " (padr�o) = construtor, porem eu criei esse construitor esse metodo para construir do meu jeito
    
    public Conta(String numeroconta) {
    	numero = numeroconta;
    }
	
	public void depositar(double valorDeposito) {
		
		if(valorDeposito<=0) {
			System.out.println("Valor incorreto,n�o foi possivel despositar esse valor !");
		}else {
			
		    saldo += valorDeposito;
		}
	}
	
	
	public boolean sacar(double valorSaque) {
		
		if(valorSaque<=0) {
			System.out.print("OPS,VALOR INCORRETO ! IMPOSSIVEL SACAR ESSA QUANTIA");
			return false;
			
		}else if(valorSaque > saldo){
			System.out.print("saldo insuficiente");
			
			return false;	
		}else {
				
			saldo -= valorSaque;	
			return true;
		}
	}
	
	
	public void transferir(Conta contadestino, double valortransferir) {
		
			boolean resultado = sacar(valortransferir);
			if(resultado) {
				contadestino.depositar(valortransferir);
			}else {
				System.out.println("erro ! n�o foi possivel transferir");
			}
			
		}
		
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
