<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>Login</title>
            </head>

            <body>
                <div>
                    <c:if test="${msgError != null}">
                        <c:out value="${msgError}"></c:out>
                    </c:if>
                    <form:form action="/registro/usuario/ingreso" method="post">
                        <br>
                        <form:label path="email">email</form:label>
                        <form:input type="email" path="email" />
                        <br>
                        <form:label path="password">Password</form:label>
                        <form:input type="password" path="password" />
                        <br>
                        <input type="submit" value="Ingresar">
                    </form:form>
                </div>
            </body>

            </html>