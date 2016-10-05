<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eventos Cadastrados</title>
    </head>
    <body>
        <h1>Eventos Cadastrados</h1>
        <table border="1">
            <tr>
                <th>Professor</th>
                <th>Evento</th>
                <th>Descrição</th>
            </tr>
            <c:forEach items="${eventos}" var="evento">
                <tr>
                    <td>${evento.professor.nome} (${evento.disciplinas})</td>
                    <td>${evento.nome}</td>
                    <td>${evento.descricao}</td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>
