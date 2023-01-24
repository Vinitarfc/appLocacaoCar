import java.util.ArrayList;
import java.util.List;

public class RepositorioVeiculosMemoria implements RepositorioVeiculos {
    private List<Veiculo> veiculos;

    public RepositorioVeiculosMemoria() {
        veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Veiculo("pequeno", 100));
        veiculos.add(new Veiculo("medio", 150));
        veiculos.add(new Veiculo("SUV", 200));
    }

    public Veiculo buscarVeiculo(String tipo) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getTipo().equals(tipo)) {
                return veiculo;
            }
        }
        return null;
    }
}