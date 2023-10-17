package br.ufrn.imd.modelo;

public class Girafa extends Animal {
	private int tamanhoLingua;
	
	public int getTamanhoLingua() {
		return tamanhoLingua;
	}

	public void setTamanhoLingua(int tamanhoLingua) {
		this.tamanhoLingua = tamanhoLingua;
	}

	@Override
	public void comer() {
		setAlimentado(true);
		setQuantidadeAlimento((int)(this.getPeso() * 0.10));
	}
}
