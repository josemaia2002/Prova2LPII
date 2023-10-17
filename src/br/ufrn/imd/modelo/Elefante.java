package br.ufrn.imd.modelo;

public class Elefante extends Animal {
	private int tamanhoTromba;
	
	public int getTamanhoTromba() {
		return tamanhoTromba;
	}

	public void setTamanhoTromba(int tamanhoTromba) {
		this.tamanhoTromba = tamanhoTromba;
	}
	
	@Override
	public void comer() {
		setAlimentado(true);
		setQuantidadeAlimento((int)(this.getPeso() * 0.15));
	}
	
}