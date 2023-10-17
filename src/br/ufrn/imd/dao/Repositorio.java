package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.Animal;
import br.ufrn.imd.modelo.Elefante;
import br.ufrn.imd.modelo.Tigre;
import br.ufrn.imd.modelo.Girafa;

public class Repositorio {
	private ArrayList<Animal> animais = new ArrayList<Animal>();
	
	public void add(Animal animal) {
		animais.add(animal);
	}
	
	public void remove(Animal animal) {
		animais.remove(animal);
	}
	
	public void listAnimais() {
		System.out.println("***************************************************");
		
		for(Animal animal : animais) {
			System.out.print("Nome: " + animal.getNome() + "	");
			System.out.println("Alimentacao: " + animal.getAlimentacao());
			System.out.print("Peso: " + animal.getPeso() + "	");
			System.out.print("Idade: " + animal.calcularIdade(animal) + "	");
			System.out.println("Alimentado: " + animal.isAlimentado());
			System.out.println("***************************************************");
		}
	}
}












