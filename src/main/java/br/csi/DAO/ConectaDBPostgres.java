package br.csi.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaDBPostgres {

    private static final String Driver = "org.postgresql.Driver", Url = "jdbc:postgresql://localhost:5432/bd_poow1", User = "postgres", Passwd = "1234";

    public static void main(String[] args) {
        new ConectaDBPostgres().getConexao();
    }

    public Connection getConexao()
    {
        Connection con = null;

        try {
            Class.forName(this.Driver);
            con = DriverManager.getConnection(this.Url, this.User, this.Passwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

}
