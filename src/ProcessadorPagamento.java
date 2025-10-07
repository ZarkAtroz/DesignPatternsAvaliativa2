/**
 * Interface que define o contrato para todos os processadores de pagamento.
 * Garante que o sistema possa interagir com qualquer método de pagamento de forma uniforme.
 */
interface ProcessadorPagamento {
    void processar(double valor);
}