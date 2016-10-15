package dao.usuario;

import modelo.Usuario;

public interface UsuarioDao {
    
    //Metodo para logon no sistema
    Usuario login(String email, String senha);
}