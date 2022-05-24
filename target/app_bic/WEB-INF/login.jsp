<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Alencar - teste</title>
</head>
<body>
<h3>Logar no sistema</h3><br/>
<form action="login" method="post">
    <label for="email"><b>Login</b></label>
    <input type="email" placeholder="fulano.ciclano@exemplo.com" name="email" required><br/><br/>
    <label for="password"><b>Senha</b></label>
    <input type="password" placeholder="senha1243" name="senha" required><br/><br/>
    <label for="cadastro"><a href="controlador?opcao=cadastro">Cadastre-se</a></label><br/><br/>
    <input type="submit" value="Login" name="Logins">
</form>

<c:if test="${not empty erro}">

    <h2>
        <b>${erro}</b>
    </h2>

</c:if>

</body>
</html>
