package br.ufrn.imd.visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.ufrn.imd.modelo.Animal;
import br.ufrn.imd.modelo.Elefante;
import br.ufrn.imd.modelo.Tigre;
import br.ufrn.imd.modelo.Girafa;
import br.ufrn.imd.dao.Repositorio;

public class ZoologicoVisao {
	public static void main(String[] args) throws ParseException {
		Animal e1 = new Elefante();
		Animal e2 = new Elefante();
		
		Animal t1 = new Tigre();
		Animal t2 = new Tigre();
		
		Animal g1 = new Girafa();
		Animal g2 = new Girafa();
		
		Repositorio db = new Repositorio();
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		String data;
		Date dt;

		
		// System.out.println(formato.format(data));
		
		// Primeiro elefante
		e1.setNome("Dumbo");
		e1.setAlimentacao("Verduras e Frutas");
		e1.setPeso(750);
		
		data = "23/11/2015";
		dt = formato.parse(data);
		e1.setDataNascimento(dt);
		
		// Segundo elefante
		e2.setNome("Tantor");
		e2.setAlimentacao("Verduras e Frutas");
		e2.setPeso(900);
		
		data = "15/04/1998";
		dt = formato.parse(data);
		e2.setDataNascimento(dt);
		
		// Primeiro tigre
		t1.setNome("Kairos");
		t1.setAlimentacao("Carne");
		t1.setPeso(300);
		
		data = "27/01/1999";
		dt = formato.parse(data);
		t1.setDataNascimento(dt);
		
		// Primeiro tigre
		t2.setNome("Jabari");
		t2.setAlimentacao("Carne");
		t2.setPeso(370);
		
		data = "16/05/1989";
		dt = formato.parse(data);
		t2.setDataNascimento(dt);		
		
		db.add(e1);
		db.add(e2);
		
		db.add(t1);
		db.add(t2);
		
		db.listAnimais();

	}
}







