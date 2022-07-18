<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>Auto</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
                    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
                    crossorigin="anonymous">
            </head>
            <style>
                /* Aqui se crea el contador y se setea a 0*/
                table {
                    counter-reset: contador;
                }

                /*Aqui se suma 1 para cada celda */
                .counterCell:before {
                    content: counter(contador);
                    counter-increment: contador;
                    /* se puede hacer contador+X para aumentar el incrementado*/
                }
            </style>

            <body>
                <div class="container">
                    <c:if test="${msgError != null}">
                        <c:out value="${msgError}"></c:out>
                    </c:if>
                    <!-- Formulario de busqueda -->
                    <form action="/auto/buscar/marca" method="post">
                        <label for="marca">Marca:</label>
                        <input type="text" id="marca" name="marca">
                        <button type="submit" class="btn btn-primary">Enviar</button>
                    </form>
                    <br>
                    <form action="/auto/buscar/color" method="post">
                        <label for="color">Color:</label>
                        <input type="text" id="color" name="color">
                        <button type="submit" class="btn btn-primary">Enviar</button>
                    </form>
                    <br>
                    <!-- paginacion -->
                    <c:forEach var="numeroPagina" begin="1" end="${totalPaginas}" >
                        <a href="/auto/pagina/${numeroPagina}">${numeroPagina}</a>
                    </c:forEach>
                    <br>
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">ID</th>
                                <th scope="col">Marca</th>
                                <th scope="col">Modelo</th>
                                <th scope="col">Color</th>
                                <th scope="col">Velocidad Maxima</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="auto" items="${autosCapturados.content}">
                                <tr>
                                    <td class="counterCell"></td>
                                    <td>${auto.id}</td>
                                    <td>${auto.marca}</td>
                                    <td>${auto.modelo}</td>
                                    <td>${auto.color}</td>
                                    <td>${auto.velocidadMax}</td>
                                    <td><a class="btn btn-warning" href="/auto/editar/${auto.id}"
                                            role="button">Editar</a></td>
                                    <td><a class="btn btn-danger" href="/auto/eliminar/${auto.id}"
                                            role="button">Eliminar</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                    integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
                    crossorigin="anonymous">
                    </script>
            </body>

            </html>