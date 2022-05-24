<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Olá ${usuario_logado.nome}</h3>
    <h3>ID da sessão: ${pageContext.session.id}</h3>
    <h3>Data de criação: ${pageContext.session.creationTime}</h3>
<%--    <h1>Último acesso: ${pageContext.session.lastAcessedTime}</h1>--%>
    <h4>
        <ul>
            <li>
                <a href="controlador?opcao=cliente">Cadastrar cliente</a>
            </li>
            <li>
                <a href="controlador?opcao=produto">Cadastrar Produto</a>
            </li>
            <li>
                <a href="controlador?opcao=logout">Logout</a>
            </li>
        </ul>
    </h4>
</body>
</html>
