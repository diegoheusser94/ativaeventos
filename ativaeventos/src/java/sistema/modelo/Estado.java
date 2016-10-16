package sistema.modelo;

import modelo.*;

public class Estado {
    private int idEstado;
    private String nmEstado;
    private char flUf;
    
    
    
    //Contrutores
    public Estado(int idEstado, String nmEstado, char flUf) {
        this.idEstado = idEstado;
        this.nmEstado = nmEstado;
        this.flUf = flUf;
    }

    public Estado() {
    }

    //Sets e Gets
    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNmEstado() {
        return nmEstado;
    }

    public void setNmEstado(String nmEstado) {
        this.nmEstado = nmEstado;
    }

    public char getFlUf() {
        return flUf;
    }

    public void setFlUf(char flUf) {
        this.flUf = flUf;
    }
}