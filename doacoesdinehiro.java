import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DoacaoDinheiro {
    private String doador;
    private double valorDoado;

    public DoacaoDinheiro(String doador, double valorDoado) {
        this.doador = doador;
        this.valorDoado = valorDoado;
    }

    public String getDoador() {
        return doador;
    }

    public void setDoador(String doador) {
        this.doador = doador;
    }

    public double getValorDoado() {
        return valorDoado;
    }

    public void setValorDoado(double valorDoado) {
        this.valorDoado = valorDoado;
    }

    @Override
    public String toString() {
        return "Doador: " + doador + ", Valor doado: R$" + valorDoado;
    }
}

public class SimulacaoDoacaoDinheiro {
    private static List<DoacaoDinheiro> doacoes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à simulação de doação de dinheiro.");

        while (true) {
            exibirMenu();

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do Scanner

            switch (opcao) {
                case 1:
                    registrarDoacao(scanner);
                    break;
                case 2:
                    listarDoacoes();
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Registrar doação de dinheiro");
        System.out.println("2. Listar todas as doações de dinheiro");
        System.out.println("3. Sair");
        System.out.print("Opção: ");
    }

    private static void registrarDoacao(Scanner scanner) {
        System.out.print("\nInforme o nome do doador: ");
        String nomeDoador = scanner.nextLine();

        System.out.print("Informe o valor a ser doado (R$): ");
        double valorDoado = scanner.nextDouble();

        DoacaoDinheiro novaDoacao = new DoacaoDinheiro(nomeDoador, valorDoado);
        doacoes.add(novaDoacao);

        System.out.println("\nDoação de R$" + valorDoado + " registrada com sucesso para " + nomeDoador + ".");
    }

    private static void listarDoacoes() {
        System.out.println("\nLista de todas as doações de dinheiro registradas:");

        for (DoacaoDinheiro doacao : doacoes) {
            System.out.println(doacao);
        }
    }
}
