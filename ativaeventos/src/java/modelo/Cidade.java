package modelo;

public class Cidade {
    private int idCidade;
    private int idEstado;
    private String nmCidade;

    public Cidade(int idCidade, int idEstado, String nmCidade) {
        this.idCidade = idCidade;
        this.idEstado = idEstado;
        this.nmCidade = nmCidade;
    }

    public Cidade() {
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNmCidade() {
        return nmCidade;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }
}