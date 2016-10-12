package dao.core;

import dao.postgres.Postgres;
import dao.usuario.UsuarioDao;

public abstract class Fabrica {
    
    public static Fabrica getFabrica(){
        //Retornar conexao com Postgres
        return new Postgres();
    }
    
    public abstract UsuarioDao getUsuarioDao();
}