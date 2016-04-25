/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jamillywaleria;

/**
 *
 * @author Jamilly
 */

//EXEMPLO DE HERANÇA: A MANSÃO HERDAR�? DA CASA OS MÉTODOS LISTAR MORADORES E GETMORADORES
public class Mansao extends Casa implements Alugavel , Compravel {
    
    int quantDias = 0;
    int numCozinheiros = 0;
    int numCamareiros = 0;
    int numBabas = 0;
    double precoAluguel = 0;
    double salCozinheiros = 1500 * numCozinheiros;
    double salCamareiros = 1300 * numCamareiros;
    double salBabas = 2000 * numBabas;
    int quantEmpregados = numCozinheiros + numCamareiros + numBabas;
    double valorAluguel = 0;
    double valorSalarios = salCozinheiros + salCamareiros + salBabas + valorAluguel;
    String novoProprietario="Novo proprietario";
    

    public Mansao(String prop, int dias, int coz, int cam, int babas, String novo) {
        super(prop);
        this.quantDias = dias;
        this.numCozinheiros = coz;
        this.numCamareiros = cam;
        this.numBabas = babas;
        this.novoProprietario= novo;
    }
    
    public double precoAluguel(){        
        return  2500 * quantDias;
    }
    
    public int getQtdeDias(){
        return this.quantDias;
    }
    

    
    public int calcularPagamentoBabas(){
        return 2000 * numBabas;
    }
    
    public int calcularPagamentoCozinheiros(){
        return 1500 * numCozinheiros;
    }
    
    public int calcularPagamentoCamareiros(){
        return 1300 * numCamareiros;
    }

	@Override
	public void comprar(String novoProprietario) {
		// TODO Auto-generated method stub
		this.novoProprietario=novoProprietario;
	}

	@Override
	public String toString() {
		return "Mansao [quantDias=" + quantDias + ", numCozinheiros=" + numCozinheiros + ", numCamareiros="
				+ numCamareiros + ", numBabas=" + numBabas + ", precoAluguel=" + precoAluguel + ", salCozinheiros="
				+ salCozinheiros + ", salCamareiros=" + salCamareiros + ", salBabas=" + salBabas + ", quantEmpregados="
				+ quantEmpregados + ", valorAluguel=" + valorAluguel + ", valorSalarios=" + valorSalarios
				+ ", novoProprietario=" + novoProprietario + "]";
	}
	
	
}

