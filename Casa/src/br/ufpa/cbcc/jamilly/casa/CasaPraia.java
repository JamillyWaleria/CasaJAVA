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

//EXEMPLO DE HERANÇA: A MANSÃO HERDAR�? DA CASA OS MÉTODOS LISTAR MORADORES E GETMORADORES
public class CasaPraia extends Casa implements Alugavel {
    
    private int quantDias = 0;
    private String nomedaPraia;
    private float distanciadaPraia= 0;
    
    public CasaPraia(String prop, int dias,String nomedaPraia,float distanciadaPraia) {
        super(prop);
        this.quantDias = dias;
        this.nomedaPraia=nomedaPraia;
        this.distanciadaPraia=distanciadaPraia;
    }
    
    public double precoAluguel(){
        return 100 * quantDias + 100 * super.getQtdeMoradores();
    }
    
    public int getQuantDias(){
        return this.quantDias;
    }

	public String getNomedaPraia() {
		return nomedaPraia;
	}

	public void setNomedaPraia(String nomedaPraia) {
		this.nomedaPraia = nomedaPraia;
	}

	public float getDistanciadaPraia() {
		return distanciadaPraia;
	}

	public void setDistanciadaPraia(float distanciadaPraia) {
		this.distanciadaPraia = distanciadaPraia;
	}
 public String toString (){
	 return  "Dados da Casa de Praia:\n"+listarMoradores()
	 		 +"\nPreço aluguel: "
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
