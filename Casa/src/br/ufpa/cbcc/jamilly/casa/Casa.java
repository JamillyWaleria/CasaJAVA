package jamillywaleria;


import java.util.ArrayList;
/**
 *
 * @author Jamilly
 */
public abstract class Casa extends Moradia {
   // ArrayList<String> moradores = new ArrayList<>();
    public Casa()
    {
    private Data myDate;
    private int LuzQuarto = 2;
    private  int portaGaragem = 2;
    public abstract void listarMoradores;
    public abstract void calcularAluguel;
    
    
    }

    
    
    public Casa (String prop){
    	super();
        this.moradores.add(prop);
    }
    
    public int getQtdeMoradores(){
        return this.moradores.size();
    }
    
    
    public int abrirPortaGaragem(){
        if (portaGaragem == 1){
        }else {
            portaGaragem = 2;
        }
        return portaGaragem;
    }
       
  
    
  /* public void addNewMorador(String m){
        this.moradores.add(m);
    }
    public Casa(Casa casa){
    	super((Moradia)casa);
    	this.moradores=casa.moradores;
    	this.portaGaragem=casa.portaGaragem;
    }
    
   /* public String listarMoradores(){
        String lista = "";
        boolean prop = true;
        for (String m : moradores) {
            if (prop){
                lista += "Proprietário: " + m + "\nMoradores: ";
                prop = false;
            }
            else
                lista += m + ", ";
        }
        return lista;
        
    }*/
    
    public String toString (){
	 return  "Dados da Casa :\n"+abrirPortaGaragem"\n"()
	 		 +fecharPortaGaragem();
			 
     
 }
}
   
   	 		
}
