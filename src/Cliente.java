public class Cliente {
    private String tipo;
    private String nome;

    public Cliente(String tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
