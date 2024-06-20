import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Alimento {
    private String tipo;
    private int quantidade;

    public Alimento(String tipo, int quantidade) {
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
        return "Alimento: " + tipo + ", Quantidade: " + quantidade;
    }
}

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
        return "Roupa: " + tipo + ", Quantidade: " + quantidade;
    }
}

public class SimulacaoDoacao {
    private static List<Alimento> doacoesAlimentos = new ArrayList<>();
    private static List<Roupa> doacoesRoupas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à simulação de doações.");

        while (true) {
            exibirMenu();

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do Scanner

            switch (opcao) {
                case 1:
                    registrarDoacaoAlimento(scanner);
                    break;
                case 2:
                    registrarDoacaoRoupa(scanner);
                    break;
                case 3:
                    listarDoacoes();
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Registrar doação de alimentos");
        System.out.println("2. Registrar doação de roupas");
        System.out.println("3. Listar todas as doações");
        System.out.println("4. Sair");
        System.out.print("Opção: ");
    }

    private static void registrarDoacaoAlimento(Scanner scanner) {
        System.out.print("\nInforme o tipo de alimento a ser doado: ");
        String tipoAlimento = scanner.nextLine();

        System.out.print("Informe a quantidade de alimentos a ser doada: ");
        int quantidade = scanner.nextInt();

        Alimento novaDoacao = new Alimento(tipoAlimento, quantidade);
        doacoesAlimentos.add(novaDoacao);

        System.out.println("\nDoação de " + quantidade + " unidades de " + tipoAlimento + " registrada com sucesso.");
    }

    private static void registrarDoacaoRoupa(Scanner scanner) {
        System.out.print("\nInforme o tipo de roupa a ser doada: ");
        String tipoRoupa = scanner.nextLine();

        System.out.print("Informe a quantidade de roupas a ser doada: ");
        int quantidade = scanner.nextInt();

        Roupa novaDoacao = new Roupa(tipoRoupa, quantidade);
        doacoesRoupas.add(novaDoacao);

        System.out.println("\nDoação de " + quantidade + " peças de " + tipoRoupa + " registrada com sucesso.");
    }

    private static void listarDoacoes() {
        System.out.println("\nLista de todas as doações registradas:");

        System.out.println("Alimentos:");
        for (Alimento alimento : doacoesAlimentos) {
            System.out.println(alimento);
        }

        System.out.println("\nRoupas:");
        for (Roupa roupa : doacoesRoupas) {
            System.out.println(roupa);
        }
    }
}
