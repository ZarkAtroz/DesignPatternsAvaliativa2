/**
 * Implementação concreta para processamento via Boleto Bancário.
 */
class ProcessadorBoleto implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Gerando boleto no valor de R$ " + valor + ".");
        // Lógica específica: registrar boleto no banco, gerar linha digitável, etc.
    }
}