package br.senai.sp.jandira.model;

public class Agencia {
	
	
	  private String Numeroagencia;
	  private String NomegerentedaAgecia;
	  private String  telefonedaAgencia;
	  private String  cidadedaAgencia;
	  
	  
	  public void setNumeroAgencia(String numerodaAgencia) {
		  
		  this.Numeroagencia = numerodaAgencia;
		  
	  }
	  
	  public String getnumeroAgencia() {
		  return Numeroagencia;
	  }
	  
	
      public void setNomegerentedaAgencia(String nomeGerenteDaAgencia) {
    	  this.NomegerentedaAgecia = nomeGerenteDaAgencia;
      }
	
      public String getNomegerentedaAgencia() {
    	  return NomegerentedaAgecia;
      }
	
      public void settelefonedaAgencia(String telefonedaAgencia) {
    	  this.telefonedaAgencia = telefonedaAgencia ;
      }
	
      public String gettelefonedaAgencia() {
    	  return NomegerentedaAgecia;
      }

      public void setcidadedaAgencia(String cidadedaAgencia){
    	  this.cidadedaAgencia = cidadedaAgencia;
    	  
      }
      
      public String getcidadedaAgenica() {
    	  return cidadedaAgencia;
      }
}
