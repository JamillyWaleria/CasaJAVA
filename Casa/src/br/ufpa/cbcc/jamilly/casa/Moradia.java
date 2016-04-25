
package jamillywaleria;

import java.lang.reflect.Array;

/**
 *
 * @author Jamilly
 */
public class Moradia {
    
    boolean LuzQuarto = false;
    
    public void NomeProprietario(){
        
      
    }
    
    public void ligarLuzQuarto(){
         if (LuzQuarto == true){
             System.out.println("A luz do quarto já está acesa.");
        }else{
             LuzQuarto = true;
             System.out.println("A luz do quarto foi acesa!");
         }
    }
    
    public void desligarLuzQuarto(){
        if (LuzQuarto == false){
            System.out.println("A luz do quarto já está desligada.");
        }else{
            LuzQuarto = false;
            System.out.println("A luz do quarto foi desligada!");
        }
    }
  
    
}
    	
    
    
     
