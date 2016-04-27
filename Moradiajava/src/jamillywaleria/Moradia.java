package jamillywaleria;

import java.lang.reflect.Array;

/**
 *
 * @author Jamilly
 */
public abstract class Moradia {
    
    boolean luzQuarto = false;
    
    public void NomeProprietario(){
        
      
    }
    
    public Moradia(){
    	
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
    	
    
    
     
