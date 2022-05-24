package br.csi.controller;

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

@WebServlet("controlador")
public class DashboardController extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String opcao = req.getParameter("opcao");

        System.out.println("Opção de navegação: " + opcao);

        String Url = "/WEB-INF/home/";

        if (req.getSession().getAttribute("usuario_logado") != null)
        {
            System.out.println(req.getSession().getAttribute("usuario_logado"));
            if (opcao.equals("cliente"))
            {
                Url += "Cliente.jsp";
            }
            else if (opcao.equals("voltar"))
            {
                Url += "Dashboard.jsp";
            }
            else if (opcao.equals("produto"))
            {
                Url += "Produtos.jsp";
            }
            else if (opcao.equals("logout"))
            {
                req.getSession().invalidate();
                Url = "/";
            }

            RequestDispatcher rd = req.getRequestDispatcher(Url);
            rd.forward(req, resp);

        }
        else
        {
            Url = "/";
            if (opcao.equals("cadastro")){
                Url = "/WEB-INF/Cadastro.jsp";
            }
            RequestDispatcher rd = req.getRequestDispatcher(Url);
            rd.forward(req, resp);
        }

    }
}
