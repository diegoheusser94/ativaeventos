package dao.postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    
    private final String url = "jdbc:postgresql://localhost/ativaeventos";
    private final String user = "ativaeventos";
    private final String senha = "ativaeventos";
    private Connection con;
    
    private Conexao() {
        try {
            con = DriverManager.getConnection(url,user,senha);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            con = null;
        }
    }
    
    public static Conexao getInstance() {
        return ConcexaoHolder.INSTANCE;
    }
    
    private static class ConcexaoHolder {

        private static final Conexao INSTANCE = new Conexao();
    }

    public Connection getCon() {
        return con;
    }
}