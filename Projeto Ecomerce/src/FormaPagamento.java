public abstract class FormaPagamento {
    private String descricao;

    public FormaPagamento(String descricao) {
        this.descricao = descricao;

    }
    public String getDescricao() {
        return this.descricao;

    }

    public abstract boolean pagar(double valor);

    public void exibirDescricao() {
        System.out.println(this.descricao);
    }

}