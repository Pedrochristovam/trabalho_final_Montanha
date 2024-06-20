# trabalho_final_Montanha
LNGUAGEM ESCOLHIDA FOI JAVA
Proposta de Problema:

Desenvolver um sistema de gestão de doações para auxiliar vítimas de enchentes no Rio Grande do Sul. O sistema deve permitir o registro de diferentes tipos de doações (alimentos, roupas, dinheiro), calcular totais por tipo de doação e armazenar informações de doações em arquivos de texto para posterior análise e relatórios.

Requisitos Funcionais:

Para identificar e listar as funcionalidades necessárias do sistema, foi utilizada uma abordagem baseada em Inteligência Artificial Generativa. Esta tecnologia foi empregada com sucesso na identificação precisa dos requisitos funcionais, garantindo a robustez e adequação do sistema às necessidades reais das vítimas de enchentes.

Diagrama de Classes:

Classe Doacao:

Propriedades: tipo (String), quantidade (int).
Métodos: getters e setters para tipo e quantidade.
Classe GestorDoacoes:

Propriedades: listaDoacoes (List<Doacao>).
Métodos:
registrarDoacao(String tipo, int quantidade): registra uma nova doação na lista.
calcularTotalPorTipo(String tipo): calcula o total de doações de um determinado tipo.
salvarDoacoesEmArquivo(String nomeArquivo): salva as informações das doações em um arquivo de texto.
Relacionamento entre as Classes:

A classe GestorDoacoes utiliza objetos da classe Doacao para armazenar e manipular informações específicas de cada doação. A lista de doações (listaDoacoes) permite o gerenciamento eficiente das doações registradas pelo sistema.

Estratégia de Programação com IA:

A IA Generativa foi fundamental na revisão de código e na prática de exercícios, proporcionando insights valiosos para a implementação eficaz do sistema. Ela auxiliou na validação dos requisitos funcionais e na garantia da integridade do código desenvolvido.

Codificação do Programa:

A implementação do sistema foi realizada em Java, assegurando a funcionalidade esperada para receber, calcular e armazenar doações conforme os requisitos identificados. A integração das funcionalidades de recebimento, cálculo e persistência das doações em arquivos de texto foi efetuada com sucesso, proporcionando uma solução completa para o gerenciamento de doações em situações de emergência.

Este projeto não apenas aplicou conceitos fundamentais de programação e orientação a objetos, mas também explorou o potencial das Inteligências Artificiais Generativas para otimização e refinamento do sistema desenvolvido.



