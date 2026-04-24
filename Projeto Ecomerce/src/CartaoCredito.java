public class CartaoCredito extends FormaPagamento {
    private String numero;
    private double limite;

    public CartaoCredito(String descricao, String numero, double limite) {
        super(descricao);
        this.numero = numero;
        this.limite = limite;

    }
    @Override
    public boolean pagar(double valor) {
        if (valor <=this.limite) {
            this.limite -= valor;
            return true;

        }
        return false;
    }

    @Override
    public String getDescricao() {
        String ultimos4;

        // Se o número do cartão tiver 4 ou mais dígitos, recortamos os últimos 4
        if (this.numero.length() >= 4) {
            ultimos4 = this.numero.substring(this.numero.length() - 4);
        } else {
            // Se tiver menos de 4, pegamos o que tem para não dar erro
            ultimos4 = this.numero;
        }

        return "Cartao final " + ultimos4;
    }
}