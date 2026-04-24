import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        this.produtos.add(p);
    }

    public void removerProduto(String nome) {
        this.produtos.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    }

    public double getTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getSubtotal();
        }
        return total;
    }

    public void listar() {
        System.out.println("Itens no Carrinho");
        for (Produto p : produtos) {
            System.out.println(p);
        }
        System.out.println("Total: R$ " + this.getTotal());
        System.out.println("\n");
    }

    public void finalizarCompra(FormaPagamento forma) {
        double total = this.getTotal();


        boolean autorizado = forma.pagar(total);


        String status = autorizado ? "APROVADO" : "RECUSADO (limite insuficiente)";

        System.out.println(forma.getDescricao() + " R$" + total + ": " + status);
    }
}