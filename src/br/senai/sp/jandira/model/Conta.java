package br.senai.sp.jandira.model;

import br.senai.sp.jandira.model.Cliente;

import br.senai.sp.jandira.lista.TipoContaList;

import br.senai.sp.jandira.model.Agencia;

public class Conta {
	
	private TipoContaList tipo;
	private String numero;
	private Agencia agencia;
	private Cliente cliente; //cliente cliente 
    private double saldo;
    
    
       //metedo conStrutor, tem o padrao já, mas se eu criar o java vai usar oq construtor que eu criei 
      // oq é o construtor? = " NEW " (padrão) = construtor, porem eu criei esse construitor esse metodo para construir do meu jeito
    
    public Conta(String numeroconta) {
    	
    	numero = numeroconta;	
    		
    }
    
    //set mandar , get são metodos de acesso!
    public void setTipo(TipoContaList tipo){
    	
         this.tipo = tipo;            	    
    }
    
    
    // get pegar, lembrando que get e set são metodos!
     public TipoContaList getTipo() { 
    	 return tipo;	 
     }
     
     
     public void setAgencia(Agencia Agencia) {
    	 this.agencia = Agencia;
      }
     
     public Agencia getAgencia() {
    	 return agencia;
    	 
     }
     
     public void Setcliente(Cliente cliente) {
    	 this.cliente = cliente;
    	 
    	 
     }
     
     public Cliente getcliente() {
    	 
    	 return cliente;
     }
     
	
     
	public void depositar(double valorDeposito) {
		
		if(valorDeposito<=0) {
			System.out.println("Valor incorreto,não foi possivel despositar esse valor !");
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
				System.out.println("erro ! não foi possivel transferir");
			}
			
	}
		
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", cliente.getNome());
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", agencia);
		System.out.printf("Tipo: %s\n", tipo);   //ordinal = por ordem de numeros(numericas) 
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
