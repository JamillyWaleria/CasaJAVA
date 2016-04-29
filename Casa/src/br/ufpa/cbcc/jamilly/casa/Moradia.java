package jamillywaleria;

import java.lang.reflect.Array;

/**
 *
 * @author Jamilly
 */
public abstract class Moradia {
	
	 public abstract void listarMoradores;
	    public abstract void calcularAluguel;
	   
     
    public void NomeProprietario(){
        
      
    }
    
    public Moradia(){
    	   
    	 boolean luzQuarto = false;
    	  
    	
    }
    
    public Moradia(Moradia moradia)
    {
    	this.luzQuarto=moradia.luzQuarto;
    
    }
    /*public Casa(Casa casa){
    	super((Moradia)casa);
    	this.moradores=casa.moradores;
    	this.portaGaragem=casa.portaGaragem;*/
    
    public void ligarLuzQuarto(){
    	public abstract void listarMoradores;
        public abstract void calcularAluguel;

         if (luzQuarto == true){
             System.out.println("A luz do quarto já está  acesa.");
        }else{
             luzQuarto = true;
             System.out.println("A luz do quarto foi acesa!");
         }
    }
    
    public void desligarLuzQuarto(){
        if (luzQuarto == false){
            System.out.println("A luz do quarto já está  desligada.");
        }else{
            luzQuarto = false;
            System.out.println("A luz do quarto foi desligada!");
        }
    }
  
    
}
    	
    
    
     
