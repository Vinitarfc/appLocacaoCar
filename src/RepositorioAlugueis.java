import java.util.List;

public interface RepositorioAlugueis {
    public void adicionarAluguel(Aluguel aluguel);
    public List<Aluguel> buscarAlugueis();
}
