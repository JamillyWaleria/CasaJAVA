
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jamillywaleria;

import javax.swing.JOptionPane;

/**
 *
 * @author Jamilly
 */

//EXEMPLO DE HERANÃ‡A: A MANSÃƒO HERDARÃ? DA CASA OS MÃ‰TODOS LISTAR MORADORES E GETMORADORES
public final class CasaPraia extends Casa implements Alugavel {
    public CasaPraia(){
    private ArrayList<String> moradores = new ArrayList<>();
    private int quantDias = 0;
    private String nomedaPraia;
    private float distanciadaPraia= 0;
    private String moradores;
    
    
    }
    
    public CasaPraia(boolean luz, String prop, int dias,String nomedaPraia,float distanciadaPraia) {
        super(prop);
        this.quantDias = dias;
        this.nomedaPraia=nomedaPraia;
        this.distanciadaPraia=distanciadaPraia;
    }
    
    public CasaPraia(String prop, int dias,String nomedaPraia,float distanciadaPraia) {
        super(prop);
        this.quantDias = dias;
        this.nomedaPraia=nomedaPraia;
        this.distanciadaPraia=distanciadaPraia;
    }
    
    public CasaPraia( CasaPraia praia)// construtor de copia
    {
    	super((Casa)praia);
    	this.quantDias=praia.quantDias;
    	this.nomedaPraia=praia.nomedaPraia;
    	this.distanciadaPraia=praia.distanciadaPraia;
    	this.moradores=casa.moradores;
    	this.portaGaragem=casa.portaGaragem;
        this.moradores.add(prop);
    }
    
    public int getQtdeMoradores(){
        return this.moradores.size();
    }
    	
    }
    public double precoAluguel(){
        return 100 * quantDias + 100 * super.getQtdeMoradores();
    }
    
    public int getQuantDias(){
        return this.quantDias;
    }

	public String getnomedaPraia() {
		return nomedaPraia;
	}

	public void setnomedaPraia(String nomedaPraia) {
		this.nomedaPraia = nomedaPraia;
	}

	public float getDistanciadaPraia() {
		return distanciadaPraia;
	}

	public void setDistanciadaPraia(float distanciadaPraia) {
		this.distanciadaPraia = distanciadaPraia;
	}
	public void addNewMorador(String m){
        this.moradores.add(m);
    }
    public CasaPraia(CasaPraia praia){
    	super((Casa)praia);
    	this.moradores=casa.moradores;
    	
    }
    public void addNewMorador(String m){
        this.moradores.add(m);
    }
  
    
    public String listarMoradores(){
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
        
    }

 public String toString (){
	 return  "Dados da Casa de Praia:\n"+listarMoradores()
	 		 +"\nPreço do  aluguel: "
			 +precoAluguel()
			 +"\nDias de hospedagem: "
			 +quantDias
			 +"\n"
			 +"Nome da Praia:"
			 +nomedaPraia
			 +"\n"
			 +"Distancia da casa da praia ao porto:"
			 +distanciadaPraia
			 +"\n";
	         
     
 }
}
