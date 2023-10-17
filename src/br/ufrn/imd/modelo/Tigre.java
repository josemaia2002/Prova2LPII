package br.ufrn.imd.modelo;

public class Tigre extends Animal {
	private String tipoTigre;

	public String getTipoTigre() {
		return tipoTigre;
	}

	public void setTipoTigre(String tipoTigre) {
		this.tipoTigre = tipoTigre;
	}
	
	@Override
	public void comer() {
		setAlimentado(true);
		setQuantidadeAlimento((int)(this.getPeso() * 0.04));
	}
}
