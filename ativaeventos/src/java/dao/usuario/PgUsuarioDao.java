package dao.usuario;

import dao.postgres.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.modelo.Usuario;

public class PgUsuarioDao implements UsuarioDao{

    @Override
    public Usuario login(String email, String senha) {
        Usuario user = new Usuario();
        String sql = "Select * from shsistema.usuario where dsemail = ? AND dssenha = ? ";
        try {
            PreparedStatement ps = Conexao.getInstance().getCon().prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                user.setIdUsuario(rs.getInt("idusuario"));
                user.setNmUsuario(rs.getString("nmusuario"));
                user.setDsEmail(email);
                user.setDsSenha(senha);
            }
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(PgUsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

}