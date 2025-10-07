/**
 * Implementação concreta para processamento via Cartão de Crédito.
 */
class ProcessadorCartaoCredito implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Processando R$ " + valor + " com Cartão de Crédito.");
        // Lógica específica: conectar ao gateway, validar dados do cartão, etc.
    }
}