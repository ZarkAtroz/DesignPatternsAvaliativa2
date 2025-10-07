/**
 * A Factory responsável por criar as instâncias dos processadores de pagamento.
 * Aplicação direta do padrão Factory Method.
 */
class PagamentoFactory {
    public enum MetodoPagamento {
        CARTAO_CREDITO,
        BOLETO,
        PIX
    }

    public static ProcessadorPagamento criarProcessador(MetodoPagamento metodo) {
        if (metodo == null) {
            throw new IllegalArgumentException("Método de pagamento não pode ser nulo.");
        }
        switch (metodo) {
            case CARTAO_CREDITO:
                return new ProcessadorCartaoCredito();
            case BOLETO:
                return new ProcessadorBoleto();
            case PIX:
                return new ProcessadorPix();
            default:
                throw new IllegalArgumentException("Método de pagamento não suportado.");
        }
    }
}
