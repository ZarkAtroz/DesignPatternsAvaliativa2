# Questão 2: Plataforma de Pagamentos com Padrão Factory Method

Este projeto implementa um sistema de processamento de pagamentos que suporta múltiplos meios (Cartão de Crédito, Boleto e PIX), utilizando o padrão de projeto **Factory Method**.

## Descrição do Problema

Uma plataforma de pagamentos precisa ser capaz de processar transações através de diferentes meios. A escolha do meio de pagamento deve ser configurável, e o sistema deve ser capaz de instanciar o processador correto dinamicamente, sem que o código principal precise conhecer os detalhes de criação de cada objeto.

## Padrão de Projeto Aplicado: Factory Method

Assim como na questão anterior, o padrão **Factory Method** foi escolhido para gerenciar a criação dos objetos de processamento de pagamento.

### Justificativa da Escolha

- **Abstração da Criação:** O sistema principal é completamente isolado do processo de instanciação. Ele apenas interage com a interface `ProcessadorPagamento`.
- **Facilidade de Manutenção:** Se a API de um dos meios de pagamento mudar, a alteração fica contida dentro da sua respectiva classe de processador, sem afetar o resto do sistema.
- **Escalabilidade:** Adicionar um novo método de pagamento (ex: "Criptomoeda") é simples: cria-se a classe `ProcessadorCripto` e atualiza-se a `PagamentoFactory`, sem impacto no código cliente.

## Estrutura do Código

- **`ProcessadorPagamento` (Interface):** Define o contrato `processar()` que todos os meios de pagamento devem implementar.
- **`ProcessadorCartaoCredito`, `ProcessadorBoleto`, `ProcessadorPix` (Classes Concretas):** Implementações que contêm a lógica específica para processar um pagamento em cada modalidade.
- **`PagamentoFactory` (Fábrica):** Centraliza a criação dos objetos `ProcessadorPagamento` com base no `MetodoPagamento` escolhido.
- **`PagamentoApp` (Cliente):** Demonstra como o sistema solicita um processador à fábrica e o utiliza para realizar um pagamento.

## Como Executar

1. Salve todo o código da Questão 2 em arquivos `.java` no mesmo diretório.
2. Abra um terminal nesse diretório.
3. Compile os arquivos:
   ```sh
   javac *.java
