<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Esteban</title>
        </head>

        <body>
            <h1>Hola
                <!--
                <c:out value="${nombre}"></c:out>
                <c:out value="${apellido}"></c:out>
                <p>
                    <c:out value="${edad}"></c:out>
                </p>
                <br>
                -->
                <p>
                    <c:out value=" ${usuario.nombre} ${usuario.apellido} ${usuario.edad} ${usuario.password}"></c:out>
                </p>
            </h1>
        </body>

        </html>