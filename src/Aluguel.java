public class Aluguel {
    private Veiculo veiculo;
    private Cliente cliente;
    private int dias;
    int id;
    static private int ultimoID = 0;

    public Aluguel(Veiculo veiculo, Cliente cliente, int dias) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dias = dias;
        this.id = ++ultimoID;
    }

    public double calcularValorFinal() {
        double valorFinal = veiculo.getPrecoBase() * dias;
        if (cliente.getTipo().equals("pessoa fisica")) {
            if (dias > 5) {
                valorFinal = valorFinal * 0.95;
            }
        } else if (cliente.getTipo().equals("pessoa juridica")) {
            if (dias > 3) {
                valorFinal = valorFinal * 0.90;
            }
        }
        return valorFinal;
    }
}