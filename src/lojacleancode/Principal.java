package lojacleancode;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       /* CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        System.out.print("Digite um produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Digite o preço unitário: R$ ");
        double precoUnitario = scanner.nextDouble();
        System.out.print("Digite a quantidade: ");
        int quantidadeProduto = scanner.nextInt();

        carrinho.adicionarItem(nomeProduto, precoUnitario, quantidadeProduto);

        Produto novoProduto = new Produto();
        System.out.print("Digite um produto: ");
        novoProduto.nome = scanner.nextLine();
        System.out.print("Digite o preço unitário: R$ ");
        novoProduto.precoUnitario = scanner.nextDouble();

        carrinho.adicionarItem(novoProduto, quantidadeProduto);*/

       /* novoProduto.alterarStatus(true);
        novoProduto.ativar();
        novoProduto.inativar();*/

        System.out.println("========================================================");
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        Produto produto = new Produto();
        System.out.print("Digite um produto: ");
        produto.nome = scanner.nextLine();
        System.out.print("Digite o preço: R$ ");
        produto.precoUnitario = scanner.nextDouble();
        System.out.print("Digite a quantidade de produtos: ");
        int quantidadeProduto = scanner.nextInt();

        System.out.println("---------------------------------------------------------");

        carrinho.adicionarItem(produto, quantidadeProduto);

        Endereco endereco = new Endereco();
        endereco.logradouro = "Rua das Amoras";
        endereco.numero = "1000";
        endereco.bairro = "Centro";
        System.out.println("---------------------------------------------------------");

        carrinho.gerarPedido();
        System.out.println("Pedido gerado.");

        System.out.println("========================================================");
        scanner.close();
    }

}
