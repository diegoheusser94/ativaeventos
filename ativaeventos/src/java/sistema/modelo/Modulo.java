package sistema.modelo;

public class Modulo {
    private int idModulo;
    private String nmModulo;
    private String dsModulo;

    public Modulo(int idModulo, String nmModulo, String dsModulo) {
        this.idModulo = idModulo;
        this.nmModulo = nmModulo;
        this.dsModulo = dsModulo;
    }

    public Modulo() {
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public String getNmModulo() {
        return nmModulo;
    }

    public void setNmModulo(String nmModulo) {
        this.nmModulo = nmModulo;
    }

    public String getDsModulo() {
        return dsModulo;
    }

    public void setDsModulo(String dsModulo) {
        this.dsModulo = dsModulo;
    }
}