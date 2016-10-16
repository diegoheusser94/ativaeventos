package sistema.modelo;

import dao.core.Fabrica;

public class Usuario {
    private int idUsuario;
    private String nmUsuario;
    private String dsEmail;
    private String dsSenha;
    private char flStatus; //A-Ativo,I-Inativo
    private String dsFoto;
    
    //Metodo para login
    public static Usuario login(String email, String senha){
        return Fabrica.getFabrica().getUsuarioDao().login(email, senha);
    }

    public Usuario(int idUsuario, String nmUsuario, String dsEmail, String dsSenha, char flStatus, String dsFoto) {
        this.idUsuario = idUsuario;
        this.nmUsuario = nmUsuario;
        this.dsEmail = dsEmail;
        this.dsSenha = dsSenha;
        this.flStatus = flStatus;
        this.dsFoto = dsFoto;
    }

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNmUsuario() {
        return nmUsuario;
    }

    public void setNmUsuario(String nmUsuario) {
        this.nmUsuario = nmUsuario;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public String getDsSenha() {
        return dsSenha;
    }

    public void setDsSenha(String dsSenha) {
        this.dsSenha = dsSenha;
    }

    public char getFlStatus() {
        return flStatus;
    }

    public void setFlStatus(char flStatus) {
        this.flStatus = flStatus;
    }
    
    public String getDsFoto(){
        return dsFoto;
    }
    
    public void setDsFoto(String dsFoto){
        this.dsFoto = dsFoto;
    }
}