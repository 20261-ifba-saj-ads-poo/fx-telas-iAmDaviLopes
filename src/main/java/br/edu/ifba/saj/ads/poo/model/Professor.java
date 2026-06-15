package br.edu.ifba.saj.ads.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	private String name;
	private List<Materias> materias;
	
	public Professor(String name) {
		this.name = name;
		this.materias = new ArrayList<>();
	}

    public String getName() {
        return name; 
    }
    
	public List<Materias> getMaterias() {
		return materias;
	}
	
}