package dao.usuario;

import sistema.modelo.Usuario;

public interface UsuarioDao {
    
    //Metodo para login no sistema
    Usuario login(String email, String senha);
}