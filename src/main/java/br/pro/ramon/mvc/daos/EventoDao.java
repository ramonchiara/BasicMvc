package br.pro.ramon.mvc.daos;

import br.pro.ramon.mvc.models.Evento;
import br.pro.ramon.mvc.models.Professor;
import java.util.ArrayList;
import java.util.List;

public class EventoDao {

    public List<Evento> findAll() {
        List<Evento> eventos = new ArrayList<Evento>();

        Professor p1 = new Professor("Bruce Banner");
        p1.add("Biologia");
        p1.add("Física Nuclear");
        p1.add("Química");

        Professor p2 = new Professor("Tony Stark");
        p2.add("Computação");
        p2.add("Engenharia");

        Evento e1 = new Evento("Radiação Gama", "Algo deu errado...", p1);
        Evento e2 = new Evento("Cura", "Mr. Green e Mr. Blue", p1);
        Evento e3 = new Evento("Afeganistão", "Criação da versão 0.1", p2);
        Evento e4 = new Evento("Obadiah", "Amigo de quem?", p2);

        eventos.add(e1);
        eventos.add(e2);
        eventos.add(e3);
        eventos.add(e4);

        return eventos;
    }

}
