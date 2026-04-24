public class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String descricao, String codigoBarras) {
        super(descricao);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public boolean pagar(double valor) {
        System.out.println("Gerando boleto com código: " + this.codigoBarras);
        return true;
    }
}
