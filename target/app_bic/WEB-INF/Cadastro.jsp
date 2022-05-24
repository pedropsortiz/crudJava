<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Cadastrar</title>
</head>
<script>
    function checarSenha() {
        var inputPasswd = document.querySelector("#passwd");
        var inputPasswdConfirmar = document.querySelector("#passwdConfirmar");
        var passwd = inputPasswd.value;
        var passwdConfirmar = inputPasswdConfirmar.value;
        if (passwd == passwdConfirmar){
            document.getElementById("formularioCadastro").submit();
        }
        else{
            alert("As senhas não coincidem!");
        }
    }
</script>
<body>
<h3>Cadastrar no sistema</h3><br/>
<form action="cadastro" method="post" id="formularioCadastro">
    <%--@declare id="password"--%>
    <label for="name"><b>Nome:</b></label>
        <input type="text" placeholder="Fulano de Tal" name="nomeCadastro" required><br/><br/>
    <label for="email"><b>Email:</b></label>
        <input type="email" placeholder="fulado.decicladno@gmail.com" name="emailCadastro" required><br/><br/>
    <label for="password"><b>Senha:</b></label>
        <input type="password" id="passwd" placeholder="senha1243" name="senhaCadastro" required><br/><br/>
    <label for="password"><b>Confirme sua senha:</b></label>
        <input type="password" id="passwdConfirmar" placeholder="senha1243" required><br/><br/>
    <input type="button" onclick="checarSenha()" value="Cadastrar" name="cadastro"><br/><br/>
    <input type="submit" value="VoltarIndex" name="voltar"><br/><br/>
</form>

<c:if test="${not empty erro}">

    <h2>
        <b>${erro}</b>
    </h2>

</c:if>

</body>
</html>
