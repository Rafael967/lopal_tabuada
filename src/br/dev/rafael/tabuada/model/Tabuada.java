package br.dev.rafael.tabuada.model;

public class Tabuada {

	private double multiplicando;
	private double menorMultiplicador;
	private double maiorMultiplicador;

	public double getMultiplicando() {
		return multiplicando;
	}

	public double getMaiorMultiplicador() {
		return maiorMultiplicador;
	}

	public void setMaiorMultiplicador(double maiorMultiplicador) {
		this.maiorMultiplicador = maiorMultiplicador;
	}

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMenorMultiplicador() {
		return menorMultiplicador;
	}

	public void setMenorMultiplicador(double menorMultiplicador) {
		this.menorMultiplicador = menorMultiplicador;
	}
	
	public void exibirTabuada() {
		
		if(menorMultiplicador > maiorMultiplicador) {
			double temp = maiorMultiplicador;
			maiorMultiplicador = menorMultiplicador;
			menorMultiplicador = temp;
		}
		
		while(menorMultiplicador <= maiorMultiplicador) {
			double produto = multiplicando * menorMultiplicador;
			System.out.printf("%s X %s = %s\n", multiplicando, menorMultiplicador, produto);
			menorMultiplicador++;
		}
		
	}

}
