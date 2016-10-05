package br.pro.ramon.mvc.models;

import java.util.ArrayList;
import java.util.List;

public class Professor {

    private String nome;
    private List<String> disciplinas;

    public Professor(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public boolean add(String e) {
        return disciplinas.add(e);
    }

}
