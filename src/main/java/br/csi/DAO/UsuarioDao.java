package br.csi.DAO;
import br.csi.model.Usuario;

import java.sql.*;

public class UsuarioDao {

    private String sql;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public Usuario getUsuario(String email, String senha){

        Usuario user = null;

        try (Connection connection = new ConectaDBPostgres().getConexao()) {
            this.sql = "SELECT idUsuario, nomeUsuario, emailUsuario, senhaUsuario FROM usuario WHERE emailUsuario = ? AND senhaUsuario = ?;";

            System.out.println(sql);

            preparedStatement = connection.prepareStatement(this.sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, senha);
            resultSet = preparedStatement.executeQuery();
            System.out.println("GetUsuario: " + preparedStatement);
            while (resultSet.next())
            {
                user = new Usuario();
                user.setId(resultSet.getInt("idUsuario"));
                user.setNome(resultSet.getString("nomeUsuario").toLowerCase());
                user.setSenha(resultSet.getString("senhaUsuario"));
                user.setEmail(resultSet.getString("emailUsuario"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;

    }

    public boolean InsertUsuario(String nome, String email, String senha){

        try (Connection connection = new ConectaDBPostgres().getConexao()) {

            this.sql = "INSERT INTO usuario (nomeUsuario, emailUsuario, senhaUsuario, dataCadastroUsuario, ativoUsuario, idpermissao) VALUES  (?, ?, ?, CURRENT_DATE, true, 1);";
            preparedStatement = connection.prepareStatement(this.sql);
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, senha);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();sd
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

        return true;

    }

}
