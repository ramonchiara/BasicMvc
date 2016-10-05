package br.pro.ramon.mvc.models;

public class Evento {

    private String nome;
    private String descricao;
    private Professor professor;

    public Evento(String nome, String descricao, Professor professor) {
        this.nome = nome;
        this.descricao = descricao;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getDisciplinas() {
        StringBuilder disciplinas = new StringBuilder();

        for (String disciplina : professor.getDisciplinas()) {
            disciplinas.append(disciplina);
            disciplinas.append(", ");
        }

        if (disciplinas.length() > 0) {
            disciplinas.setLength(disciplinas.length() - 2);
        }

        return disciplinas.toString();
    }

}
