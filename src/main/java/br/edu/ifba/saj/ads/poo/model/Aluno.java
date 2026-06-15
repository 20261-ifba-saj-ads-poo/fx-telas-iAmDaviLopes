package br.edu.ifba.saj.ads.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String name;
	private List<Materias> materias;
	
	public Aluno(String name) {
		this.name = name;
		this.materias = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Materias> getMaterias() {
		return materias;
	}

	public void setMaterias(Materias materias) {
		if (this.materias.contains(materias)) {
			return;
		}
			
		this.materias.add(materias);
	}
	
	
}
