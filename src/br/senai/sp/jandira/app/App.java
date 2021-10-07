package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoContaList;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;
import br.senai.sp.jandira.model.Agencia;

public class App {

	public static void main(String[] args) {
		
		// Criação da conta da Maria   //criar cliente maria! //criar class agencia + conta new agencia
		
		Agencia agencia = new Agencia();
		agencia.setNomegerentedaAgencia("CLEITO");
		agencia.setNumeroAgencia("8214-9");
		agencia.settelefonedaAgencia("(11)98555555");
		agencia.setcidadedaAgencia("Jandira");
		///////////////////////////////////
		Cliente clienteMaria = new Cliente();
	    clienteMaria.setNome("Maria");
	    clienteMaria.Setemail("maria@gmail.com");
	    clienteMaria.setsalario(1000);
		////////////////////////////////
		Conta contaMaria = new Conta("7845-8");
		contaMaria.Setcliente(clienteMaria);
		contaMaria.setAgencia(agencia);
		contaMaria.depositar(500); 
		contaMaria.setTipo(TipoContaList.CORRENTE);
		contaMaria.Setcliente(clienteMaria);
		
       		
		
		// Criação da conta do Pedro
		Cliente clientePedro = new Cliente();
	    clientePedro.setNome("Pedro");
	    clientePedro.Setemail("Pedro@gmail.com");
	    clientePedro.setsalario(2000);
		///////////////////////////////////
		Conta contaPedro = new Conta("6547-6");
		contaPedro.Setcliente(clientePedro); 
		contaPedro.setAgencia(agencia);
		contaPedro.depositar(300);
		contaPedro.setTipo(TipoContaList.POUPANÇA); 

		
		
		// Criação da conta da Ana
		Cliente clienteAna = new Cliente();
	    clienteAna.setNome("Ana");
	    clienteAna.Setemail("Ana@gmail.com");
	    clienteAna.setsalario(3000);
	/////////////////////////////////////////
		Conta contaAna = new Conta("23145-9");
		contaAna.Setcliente(clienteAna);
		contaAna.setAgencia(agencia);
		contaAna.depositar(2000);
		contaAna.setTipo(TipoContaList.SALARIO);
		
		
		
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
