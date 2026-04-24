public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto("notebook", 4000.00, 1);
        Produto p2 = new Produto("mouse", 80.00, 1);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);

        carrinho.listar();

        CartaoCredito cartao = new CartaoCredito("Cartão de Crédito", "0000000000004321", 5000.0);

        Pix pix = new Pix("Pix", "email@pix.com");


        CartaoCredito fraco = new CartaoCredito("Cartão de Crédito", "0000000000002222", 1000.0);


        System.out.println("PROCESSANDO PAGAMENTOS");
        System.out.print("\n");


        carrinho.finalizarCompra(cartao);
        carrinho.finalizarCompra(pix);
        carrinho.finalizarCompra(fraco);



        carrinho = null;
        System.out.println("O carrinho foi descartado!");
        System.out.println("Mas os produtos continuam existindo no sistema:");
        System.out.print("\n");
        System.out.println("- " + p1.getNome() + " (Preço: " + p1.getPreco() + ")");
        System.out.println("- " + p2.getNome() + " (Preço: " + p2.getPreco() + ")");
    }
}
