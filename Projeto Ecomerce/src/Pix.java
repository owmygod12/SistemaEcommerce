public class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String descricao, String chavePix) {
        super(descricao);
        this.chavePix = chavePix;
    }

    @Override
    public boolean pagar(double valor) {
        // Enunciado pede: sempre retorna true; imprime a chave usada
        System.out.println("Processando chave Pix: " + this.chavePix);
        return true;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " (chave: " + this.chavePix + ")";
    }
}