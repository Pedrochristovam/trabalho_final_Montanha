public class Doacao {
    private String TIPO;
    private double QUANTIDADE;
    private String DATA;

    public Doacao(String TIPO, double QUANTIDADE, String DATA) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.data = data;
    }

    public String getTIPO() {
        return tipo;
    }

    public double getQUANTIDADE() {
        return quantidade;
    }

    public String getDATA() {
        return data;
    }

    @Override
    public String toString() {
        return TIPO + "," + QAUNTIDADE  + "," + DATA;
    }

}
