/**
 * Implementação concreta para processamento via PIX.
 */
class ProcessadorPix implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Gerando QR Code PIX para pagamento de R$ " + valor + ".");
        // Lógica específica: gerar QR Code dinâmico, aguardar confirmação, etc.
    }
}