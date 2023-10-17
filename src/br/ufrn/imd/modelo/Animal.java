package br.ufrn.imd.modelo;

import java.util.Date;

public abstract class Animal {
	protected String nome;
	protected Date dataNascimento;
	protected int peso;
	protected boolean alimentado;
	protected String alimentacao;
	protected int quantidadeAlimento;
	
	public Animal() {
		this.alimentado = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isAlimentado() {
		return alimentado;
	}

	public void setAlimentado(boolean alimentado) {
		this.alimentado = alimentado;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public int getQuantidadeAlimento() {
		return quantidadeAlimento;
	}

	public void setQuantidadeAlimento(int quantidadeAlimento) {
		this.quantidadeAlimento = quantidadeAlimento;
	}

	public void comer() {
		setAlimentado(true);
		setQuantidadeAlimento((int)(this.getPeso() * 0.05));
	}
	
	public int calcularIdade(Animal a) {
		Date dataAtual = new Date();
		int idade = dataAtual.getYear() - a.getDataNascimento().getYear();
		
		return idade;
	}
}
