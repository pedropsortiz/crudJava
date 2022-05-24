package br.csi.controller;

import br.csi.model.Usuario;
import br.csi.service.UsuarioService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("login")

public class LoginController extends HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");

        RequestDispatcher rd;

            Usuario usuario = new UsuarioService().autenticado(email, senha);

            if (usuario != null) {
                HttpSession sessao = req.getSession();
                sessao.setAttribute("usuario_logado", usuario);
                rd = req.getRequestDispatcher("WEB-INF/home/Dashboard.jsp");
            } else {
                req.setAttribute("erro", "Usuário ou senha incorretos");
                rd = req.getRequestDispatcher("WEB-INF/login.jsp");
            }

            rd.forward(req, rep);

    }

}