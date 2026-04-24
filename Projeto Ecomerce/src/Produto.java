public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }
    public double getSubtotal() {
        return this.preco * this.quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public String toString() {
        // Formata a impressão para ficar bonita quando o Carrinho listar os produtos
        return this.nome + " (Qtd: " + this.quantidade + ") - Preço Unitário: R$ " + this.preco +
                " | Subtotal: R$ " + this.getSubtotal();
    }

}