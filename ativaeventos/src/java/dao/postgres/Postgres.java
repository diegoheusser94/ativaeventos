package dao.postgres;

import dao.core.Fabrica;
import dao.usuario.PgUsuarioDao;
import dao.usuario.UsuarioDao;

public class Postgres extends Fabrica{

    @Override
    public UsuarioDao getUsuarioDao() {
        return new PgUsuarioDao();
    }
}