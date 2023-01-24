import java.util.List;
public class Aplicacao {
    public static void main(String[] args) {
        RepositorioVeiculos repositorioVeiculos = new RepositorioVeiculosMemoria();
        Veiculo veiculo1 = repositorioVeiculos.buscarVeiculo("pequeno");
        Veiculo veiculo2 = repositorioVeiculos.buscarVeiculo("medio");
        Veiculo veiculo3 = repositorioVeiculos.buscarVeiculo("SUV");

        Cliente cliente1 = new Cliente("pessoa fisica", "Vinicius Lopes");
        Cliente cliente2 = new Cliente("pessoa juridica", "Banco Santander");

        Aluguel aluguel1 = new Aluguel(veiculo1, cliente1, 7);
        Aluguel aluguel2 = new Aluguel(veiculo2, cliente2, 4);
        Aluguel aluguel3 = new Aluguel(veiculo3, cliente1, 3);

        RepositorioAlugueis repositorioAlugueis = new RepositorioAlugueisMemoria();
        repositorioAlugueis.adicionarAluguel(aluguel1);
        repositorioAlugueis.adicionarAluguel(aluguel2);
        repositorioAlugueis.adicionarAluguel(aluguel3);

        List<Aluguel> alugueis = repositorioAlugueis.buscarAlugueis();
        for (Aluguel aluguel : alugueis) {
            System.out.println("Valor final do aluguel " + aluguel.id + " : " + aluguel.calcularValorFinal());
        }
    }
}

