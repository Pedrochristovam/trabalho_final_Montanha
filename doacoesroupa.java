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

class Doador {
    private String nome;
    private List<Alimento> alimentosDoados;
    private List<Roupa> roupasDoadas;

    public Doador(String nome) {
        this.nome = nome;
        this.alimentosDoados = new ArrayList<>();
        this.roupasDoadas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Alimento> getAlimentosDoados() {
        return alimentosDoados;
    }

    public List<Roupa> getRoupasDoadas() {
        return roupasDoadas;
    }

    public void adicionarDoacaoAlimento(String tipo, int quantidade) {
        Alimento alimento = new Alimento(tipo, quantidade);
        alimentosDoados.add(alimento);
    }

    public void adicionarDoacaoRoupa(String tipo, int quantidade) {
        Roupa roupa = new Roupa(tipo, quantidade);
        roupasDoadas.add(roupa);
    }
}

public class SimulacaoDoacao {
    private static List<Doador> listaDoadores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à simulação de doação.");

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
        System.out.print("\nInforme o nome do doador: ");
        String nomeDoador = scanner.nextLine();

        Doador doadorExistente = buscarDoador(nomeDoador);
        if (doadorExistente == null) {
            doadorExistente = new Doador(nomeDoador);
            listaDoadores.add(doadorExistente);
        }

        System.out.print("Informe o tipo de alimento a ser doado: ");
        String tipoAlimento = scanner.nextLine();

        System.out.print("Informe a quantidade de alimentos a ser doada: ");
        int quantidade = scanner.nextInt();

        doadorExistente.adicionarDoacaoAlimento(tipoAlimento, quantidade);

        System.out.println("\nDoação de alimento registrada com sucesso para " + nomeDoador + ".");
    }

    private static void registrarDoacaoRoupa(Scanner scanner) {
        System.out.print("\nInforme o nome do doador: ");
        String nomeDoador = scanner.nextLine();

        Doador doadorExistente = buscarDoador(nomeDoador);
        if (doadorExistente == null) {
            doadorExistente = new Doador(nomeDoador);
            listaDoadores.add(doadorExistente);
        }

        System.out.print("Informe o tipo de roupa a ser doada: ");
        String tipoRoupa = scanner.nextLine();

        System.out.print("Informe a quantidade de roupas a ser doada: ");
        int quantidade = scanner.nextInt();

        doadorExistente.adicionarDoacaoRoupa(tipoRoupa, quantidade);

        System.out.println("\nDoação de roupa registrada com sucesso para " + nomeDoador + ".");
    }

    private static void listarDoacoes() {
        System.out.println("\nLista de todas as doações registradas:");

        for (Doador doador : listaDoadores) {
            System.out.println("Doador: " + doador.getNome());

            List<Alimento> alimentosDoados = doador.getAlimentosDoados();
            if (!alimentosDoados.isEmpty()) {
                System.out.println("Alimentos:");
                for (Alimento alimento : alimentosDoados) {
                    System.out.println(" - " + alimento);
                }
            }

            List<Roupa> roupasDoadas = doador.getRoupasDoadas();
            if (!roupasDoadas.isEmpty()) {
                System.out.println("Roupas:");
                for (Roupa roupa : roupasDoadas) {
                    System.out.println(" - " + roupa);
                }
            }

            System.out.println();
        }
    }

    private static Doador buscarDoador(String nomeDoador) {
        for (Doador doador : listaDoadores) {
            if (doador.getNome().equalsIgnoreCase(nomeDoador)) {
                return doador;
            }
        }
        return null;
    }
}
