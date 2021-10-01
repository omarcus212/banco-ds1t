package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoContaList;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.titular = "Maria Antonieta";
		contaMaria.setnumeroAgencia("8214-9");
		contaMaria.depositar(500); 
		contaMaria.setTipo(TipoContaList.CORRENTE); 
		
       		
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.titular = "Pedro Cabral";
		contaPedro.depositar(300);
		contaPedro.setTipo(TipoContaList.POUPANÇA); 
		contaPedro.setnumeroAgencia("7867-9");
		
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.titular = "Ana Gomes";
		contaAna.depositar(2000);
		contaAna.setTipo(TipoContaList.SALARIO); 
		contaAna.setnumeroAgencia("5214-9");
		
		
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		
		System.out.println();
		System.out.print("*************************");
		System.out.println();
		
		
        //depositar Dinheiro na conta //
		contaMaria.depositar(100);
		contaMaria.exibirDetalhes();
		
		//sacar 100 reais da conta 
		contaMaria.sacar(100);
		contaMaria.exibirDetalhes();
		
		// transferir dinheirooooooooo  
		contaMaria.transferir(contaPedro,20);
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		
		
		
	}

}
