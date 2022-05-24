package br.csi.service;

import br.csi.DAO.UsuarioDao;
import br.csi.model.Usuario;

import java.sql.SQLException;

public class UsuarioService {

    public Usuario autenticado(String email, String senha) {

        Usuario u = new UsuarioDao().getUsuario(email, senha);

        try {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)){
                return u;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public boolean Inserir(String nome, String email, String senha) {

        if (new UsuarioDao().InsertUsuario(nome, email, senha)){
            return true;
        }else{
            return false;
        }

    }
}
