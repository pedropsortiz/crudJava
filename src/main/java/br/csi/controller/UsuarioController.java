package br.csi.controller;

import br.csi.model.Usuario;
import br.csi.service.UsuarioService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("cadastro")

public class UsuarioController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

        String nome = req.getParameter("nomeCadastro");
        String email = req.getParameter("emailCadastro");
        String senha = req.getParameter("senhaCadastro");

        RequestDispatcher rd;

        String Url = "/WEB-INF/";

        try {
            if (new UsuarioService().Inserir(nome, email, senha)){
                Url += "login.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("erro", "Erro no cadastro!");
            Url += "Cadastro.jsp";
        }
        rd = req.getRequestDispatcher(Url);
        rd.forward(req, rep);

    }
}