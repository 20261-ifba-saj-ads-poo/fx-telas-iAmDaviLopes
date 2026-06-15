package br.edu.ifba.saj.ads.poo.model;



import java.util.ArrayList;
import java.util.List;

public class Materias {
	private String name;
	private List<Professor> professores;
	private List<Aluno> alunos;
	

	public Materias(String name) {
		this.name = name;
		this.professores = new ArrayList<>();
		this.alunos = new ArrayList<>();
	}

    public String getName() {
        return name;
    }

	public List<Professor> getProfessores() {
		return professores;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

}


/* Professor p = new Professor(chbProfessores.getText());
        
        System.out.println("Salvar professores"+p.getName()); */