package br.pro.ramon.mvc.controllers;

import br.pro.ramon.mvc.daos.EventoDao;
import br.pro.ramon.mvc.models.Evento;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/eventos")
public class EventoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EventoDao dao = new EventoDao();
        List<Evento> eventos = dao.findAll();
        request.setAttribute("eventos", eventos);
        request.getRequestDispatcher("/WEB-INF/views/eventos.jsp").forward(request, response);
    }

}
