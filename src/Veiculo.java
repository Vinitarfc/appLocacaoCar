public class Veiculo {
    private String tipo;
    private double precoBase;

    public Veiculo(String tipo, double precoBase) {
        this.tipo = tipo;
        this.precoBase = precoBase;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecoBase() {
        return precoBase;
    }
}