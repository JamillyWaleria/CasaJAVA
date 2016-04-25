/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jamillywaleria;


import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 *
 * @author Jamilly
 */
public class Casa extends Moradia {
    private ArrayList<String> moradores = new ArrayList<>();
    private double precoLuz = 20;
    private double precoKw = 0.525389;
    private Date myDate;
    private int LuzQuarto = 2;
    private int portaGaragem = 2;
    private boolean iptu = false;
    private String TipoMoradia;
    
    public Casa (String prop){
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
    
    
   	 		
}
