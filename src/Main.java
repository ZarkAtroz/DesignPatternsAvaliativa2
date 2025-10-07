// Questão 2: Código
public class Main {
    public static void main(String[] args) {
        // O sistema configura o método de pagamento (poderia vir de um arquivo, banco de dados, etc.)
        PagamentoFactory.MetodoPagamento metodoEscolhido = PagamentoFactory.MetodoPagamento.PIX;
        double valorDaCompra = 250.75;

        // O cliente solicita à fábrica o processador correspondente, sem conhecer a classe concreta.
        ProcessadorPagamento processador = PagamentoFactory.criarProcessador(metodoEscolhido);

        // O processador é usado de forma polimórfica.
        processador.processar(valorDaCompra);

        System.out.println("---");

        metodoEscolhido = PagamentoFactory.MetodoPagamento.BOLETO;
        processador = PagamentoFactory.criarProcessador(metodoEscolhido);
        processador.processar(120.00);
    }
}