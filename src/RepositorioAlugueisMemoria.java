import java.util.ArrayList;
import java.util.List;

public class RepositorioAlugueisMemoria implements RepositorioAlugueis {
    private List<Aluguel> alugueis;

    public RepositorioAlugueisMemoria() {
        alugueis = new ArrayList<Aluguel>();
    }

    public void adicionarAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public List<Aluguel> buscarAlugueis() {
        return alugueis;
    }
}