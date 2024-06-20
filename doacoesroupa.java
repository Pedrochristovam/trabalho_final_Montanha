import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Roupa {
    private String tipo;
    private int quantidade;

    public Roupa(String tipo, int quantidade) {
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Quantidade: " + quantidade;
    }
}

public class SimulacaoDoacaoRoupa {
    private static List<Roupa> doacoesRoupas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à simulação de doação de roupas.");

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
        System.out.println("1. Registrar doação de roupa");
        System.out.println("2. Listar todas as doações de roupa");
        System.out.println("3. Sair");
        System.out.print("Opção: ");
    }

    private static void registrarDoacao(Scanner scanner) {
        System.out.print("\nInforme o tipo de roupa a ser doada (ex: camisa, calça, sapato): ");
        String tipoRoupa = scanner.nextLine();

        System.out.print("Informe a quantidade de roupas a ser doada: ");
        int quantidade = scanner.nextInt();

        Roupa novaDoacao = new Roupa(tipoRoupa, quantidade);
        doacoesRoupas.add(novaDoacao);

        System.out.println("\nDoação de " + quantidade + " peças de " + tipoRoupa + " registrada com sucesso.");
    }

    private static void listarDoacoes() {
        System.out.println("\nLista de todas as doações de roupa registradas:");

        for (Roupa roupa : doacoesRoupas) {
            System.out.println(roupa);
        }
    }
}
