package jamillywaleria;

import javax.swing.JOptionPane;

/**
 *
 * @author Jamilly
 */
public class Main {

    public static void main(String[] args) {

        
        
        
    	String m = JOptionPane.showInputDialog("Digite o nome do propriet·rio da casa:");
        Casa casa1 = new Mansao (true,m, 5, 3, 7, 2, "oi");
        Casa casap =new CasaPraia (true,m, 0,"Outeiro",2);
        
        int c = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais moradores a esta casa?");
        while (c == JOptionPane.OK_OPTION){
            m = JOptionPane.showInputDialog("Digite o nome do morador: (J· existem "+casa1.getQtdeMoradores() + " moradores).");
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
        
        
        
        //CASA DE PRAIA - AQUI COME√áA ONDE A CASA DE PRAIA SER√? DECLARADA
        m = JOptionPane.showInputDialog("Digite o nome do propriet·rio da casa de praia:");
       String d =JOptionPane.showInputDialog("Por quantos dias v„o alugar a casa de praia?");//excessao
        String n= JOptionPane.showInputDialog("Qual o nome da praia?");
        String k = JOptionPane.showInputDialog("qual a distancia em Km casa ao porto?");//excessao
        CasaPraia casa2= new CasaPraia(m, Integer.parseInt(d), n, Float.parseFloat(k));
        
        
        c = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais moradores a esta casa de praia?");
        while (c == JOptionPane.OK_OPTION){
            //EXEMPLO DE POLIMORFISMO
            m = JOptionPane.showInputDialog("Digite o nome do morador: (J· existem "+casa1.getQtdeMoradores() + " moradores).");
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
        
        
        //Mans√£o - PARTE ONDE A MANS√ÉO SER√? DECLARADA
        m = JOptionPane.showInputDialog("Digite o nome do propriet·rio da manss„o:");
        String cp=JOptionPane.showInputDialog("Deseja comprar ou alugar a mans„o(Valor da mansao para a compra R$ 20 milhıes ?\n Para comprar digite C Para alugar digite A: ");
         
      try // tratamento de excess„o
         {
    	  d="0";
        if (cp== "C") JOptionPane.showMessageDialog(null, "Casa vendida");
        
        else if (cp=="A"){
        	JOptionPane.showMessageDialog(null, "Alugar casa");
        	d = JOptionPane.showInputDialog("Por quantos dias v„o alugar a manss„o?");
        }
         }catch (NullPointerException e){
        	 JOptionPane.showMessageDialog(null, "Opcao invalida! Digite: \n (C)PARA COMPRAR MANSAO \n (A )PARA ALUGAR MANSAO.");
        	 
         }
        String novo=JOptionPane.showInputDialog("Nome do novo proprietario");
       
        String cz = JOptionPane.showInputDialog("Quantos cozinheiros tem a mans„o?");
        String ca = JOptionPane.showInputDialog("Quantos camareiros tem a mans„o?");
        String ba = JOptionPane.showInputDialog("Quantas bab·s tem a manss„o?");
        Mansao casa3 = new Mansao(m, Integer.parseInt(d), Integer.parseInt(cz), Integer.parseInt(ca), Integer.parseInt(ba),novo);
        
        c = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais moradores a esta manss„o?");
        while (c == JOptionPane.OK_OPTION){
            //EXEMPLO DE POLIMORFISMO
            m = JOptionPane.showInputDialog("Digite o nome do morador: (J· existem "+casa1.getQtdeMoradores() + " moradores).");
            casa3.addNewMorador(m);
            c = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais moradores a esta manss„o?");
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
    
        /* Instanceof
        Casa obj = new Mansao();
        
        if (obj instanceof Mansao){
        	Mansao aux = (Mansao)obj;
        	aux.calcularPagamentoCozinheiros();*/
        	
    
     //instanceof   
     
          Moradia[] = {casa, casapraia, mansao};
		//Scanner ler = new Scanner(System.in);	
		
		
		String entrada;
		entrada = JOptionPane.showInputDialog("Escolha um tipo de Moradia: 1 MORADIA, 2 CASA, 3 CASA DA PARAIA, 4 MANSAO");
		int opcao = Integer.parseInt(entrada);
		//opcao = JOptionPane.showConfirmDialog(null, "Opcao");
		
		
		
		//int opcao = ler.nextInt();
			
		switch(opcao){
			case 1:
				try{
					for(int i=0; i<=moradia.length; i++){
						if(moradia[i] instanceof Casa){
							((Casa) moradia[i]).abrirPortaGaragem();
						}
						if(moradia[i] instanceof CasaPraia){
							((CasaPraia) moradia[i]).nomedaPraia();
						}
						if(moradia[i] instanceof Mansao){
							((Mansao) moradia[i]).calcularPagamentoBabas();
						} 
    
						}
					}
				}
				catch (Exception excessao){
					//System.out.print("\n\nExcedeu o limite do array, corrigir laco FOR: "+excessao);
					JOptionPane.showMessageDialog(null, "Excedeu o limite do array, corrigir laco FOR: "+excessao);
				}
				
				case 2:
					JOptionPane.showMessageDialog(null, "Escolha Encerrada ");
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Opcao invalida,escolha encerrada.");
					System.exit(0);
			}
		}
		catch (Exception NumberFormatException){
			//System.out.print("Opcao Invalida, digite somente numeros");
			JOptionPane.showMessageDialog(null, "Opcao invalida, digite somente numeros, escolha encerrada.");
		}
	}
         
        
        /*EXEMPLO DE POLIMORFISMO
        JOptionPane.showMessageDialog(null, "Dados da mans√£o:\n"+casa3.listarMoradores()+
                "\nPre√ßo aluguel: "+casa3.precoAluguel()+
                "\nDias de hospedagem: "+casa3.getQtdeDias()+
                "\nSal√°rio dos cozinheiros: "+casa3.calcularPagamentoCozinheiros()+
                "\nSal√°rio dos camareiros: "+casa3.calcularPagamentoCamareiros()+
                "\nSal√°rio das bab√°s: "+casa3.calcularPagamentoBabas()+
                "\n" + "Status da luz: "+luz3+
                "\n" + "Status da garagem: "+garagem3);*/
        
    }
}
