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
public class JamillyWaleria {

    public static void main(String[] args) {

        
        
        
        String m = JOptionPane.showInputDialog("Digite o nome do proprietário da casa:");
        Casa casa1 = new Casa(m);
        
        int c = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais moradores a esta casa?");
        while (c == JOptionPane.OK_OPTION){
            m = JOptionPane.showInputDialog("Digite o nome do morador: (Já existem "+casa1.getQtdeMoradores() + " moradores).");
            casa1.addNewMorador(m);
            c = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais moradores a esta casa?");
        }
        
        String luz;
        int z = JOptionPane.showConfirmDialog(null, "Deseja alterar o status das luzes do quarto?");
        if (z == JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(null, "Luz acesa!");
            luz = "Luz acesa!";
        }else{
            JOptionPane.showMessageDialog(null, "Luz apagada!");
            luz = "Luz apagada!";
        }
   
        String garagem;
        int x = JOptionPane.showConfirmDialog(null, "Deseja alterar o status da garagem?");
        if (x == JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(null, "Garagem aberta!");
            garagem = "Garagem aberta!";
        }else{
            JOptionPane.showMessageDialog(null, "Garagem fechada!");
            garagem = "Garagem fechada!";
        }
        
        JOptionPane.showMessageDialog(null, "Dados da Casa:\n"+casa1.listarMoradores()+"\n" + "Status da luz: "+luz+"\n" + "Status da garagem: "+garagem);
        
        
        
        //CASA DE PRAIA - AQUI COMEÇA ONDE A CASA DE PRAIA SER�? DECLARADA
        m = JOptionPane.showInputDialog("Digite o nome do proprietário da casa de praia:");
       String d =JOptionPane.showInputDialog("Por quantos dias vão alugar a casa de praia?");//excessao
        String n= JOptionPane.showInputDialog("Qual o nome da praia?");
        String k = JOptionPane.showInputDialog("qual a distancia em Km casa ao porto?");//excessao
        CasaPraia casa2= new CasaPraia(m, Integer.parseInt(d), n, Float.parseFloat(k));
        
        
        c = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais moradores a esta casa de praia?");
        while (c == JOptionPane.OK_OPTION){
            //EXEMPLO DE POLIMORFISMO
            m = JOptionPane.showInputDialog("Digite o nome do morador: (Já existem "+casa1.getQtdeMoradores() + " moradores).");
            casa2.addNewMorador(m);
            c = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais moradores a esta casa de praia?");
        }
        String luz2;
        int z2 = JOptionPane.showConfirmDialog(null, "Deseja alterar o status das luzes do quarto?");
        if (z2 == JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(null, "Luz acesa!");
            luz2 = "Luz acesa!";
        }else{
            JOptionPane.showMessageDialog(null, "Luz apagada!");
            luz2 = "Luz apagada!";
        }
   
        String garagem2;
        int x2 = JOptionPane.showConfirmDialog(null, "Deseja alterar o status da garagem?");
        if (x2 == JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(null, "Garagem aberta!");
            garagem2 = "Garagem aberta!";
        }else{
            JOptionPane.showMessageDialog(null, "Garagem fechada!");
            garagem2 = "Garagem fechada!";
        }
        
        JOptionPane.showMessageDialog(null, "Dados da Casa de Praia:\n"+casa2+ "Status da luz: "+luz2+"\n" + "Status da garagem: "+garagem2);
        
        
        //Mansão - PARTE ONDE A MANSÃO SER�? DECLARADA
        m = JOptionPane.showInputDialog("Digite o nome do proprietário da mansão:");
        String cp=JOptionPane.showInputDialog("Deseja comprar ou alugar a mans�o(Valor da mansao para a compra R$ 20 milh�es ?\n Para comprar digite C Para alugar digite A: ");
         
      try // tratamento de excess�o
         {
    	  d="0";
        if (cp== "C") JOptionPane.showMessageDialog(null, "Casa vendida");
        
        else if (cp=="A"){
        	JOptionPane.showMessageDialog(null, "Alugar casa");
        	d = JOptionPane.showInputDialog("Por quantos dias vão alugar a mansão?");
        }
         }catch (NullPointerException e){
        	 
         }
        String novo=JOptionPane.showInputDialog("Nome do novo proprietario");
       
        String cz = JOptionPane.showInputDialog("Quantos cozinheiros tem a mansão?");
        String ca = JOptionPane.showInputDialog("Quantos camareiros tem a mansão?");
        String ba = JOptionPane.showInputDialog("Quantas babás tem a mansão?");
        Mansao casa3 = new Mansao(m, Integer.parseInt(d), Integer.parseInt(cz), Integer.parseInt(ca), Integer.parseInt(ba),novo);
        
        c = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais moradores a esta mansão?");
        while (c == JOptionPane.OK_OPTION){
            //EXEMPLO DE POLIMORFISMO
            m = JOptionPane.showInputDialog("Digite o nome do morador: (Já existem "+casa1.getQtdeMoradores() + " moradores).");
            casa3.addNewMorador(m);
            c = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais moradores a esta mansão?");
        }
        
        String luz3;
        int z3 = JOptionPane.showConfirmDialog(null, "Deseja alterar o status das luzes do quarto?");
        if (z3 == JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(null, "Luz acesa!");
            luz3 = "Luz acesa!";
        }else{
            JOptionPane.showMessageDialog(null, "Luz apagada!");
            luz3 = "Luz apagada!";
        }
   
        String garagem3;
        int x3 = JOptionPane.showConfirmDialog(null, "Deseja alterar o status da garagem?");
        if (x3 == JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(null, "Garagem aberta!");
            garagem3 = "Garagem aberta!";
        }else{
            JOptionPane.showMessageDialog(null, "Garagem fechada!");
            garagem3 = "Garagem fechada!";
        }
        
        /*EXEMPLO DE POLIMORFISMO
        JOptionPane.showMessageDialog(null, "Dados da mansão:\n"+casa3.listarMoradores()+
                "\nPreço aluguel: "+casa3.precoAluguel()+
                "\nDias de hospedagem: "+casa3.getQtdeDias()+
                "\nSalário dos cozinheiros: "+casa3.calcularPagamentoCozinheiros()+
                "\nSalário dos camareiros: "+casa3.calcularPagamentoCamareiros()+
                "\nSalário das babás: "+casa3.calcularPagamentoBabas()+
                "\n" + "Status da luz: "+luz3+
                "\n" + "Status da garagem: "+garagem3);*/
        
    }
}
