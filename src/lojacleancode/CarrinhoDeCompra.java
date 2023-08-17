package lojacleancode;

import java.util.Objects;

public class CarrinhoDeCompra {

    public static final double TAXA_SERVICO_PADRAO = 0.10;
    int quantidadeItens;
    Produto produto = new Produto();

    void adicionarItem(String nomeProduto, double precoUnitario, int quantidade) {
        // TODO implementar
    }

    void adicionarItem(Produto produto, int quantidade) {
        Objects.requireNonNull(produto, "Produto deve ser informado.");

        if(quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que 0.");
        }
        System.out.printf("Produto: %s%n", produto.nome);

        // TODO implementar
    }

    void gerarPedido(Endereco enderecoEntrega) {
        Objects.requireNonNull(enderecoEntrega, "Endereço de entrega deve ser informado.");
        criarNovoPedido(enderecoEntrega);
    }

    void gerarPedido() {
        criarNovoPedido(null);
    }

    // método interno (vamos estudar sobre private em breve)
    private void criarNovoPedido(Endereco enderecoEntrega) {
        // TODO implementar
    }

    void realizarCompra(String numeroCartao) {
        double valorTotal = calcularValorTotal();

        boolean pagamentoAutorizado = GatewayPagamento
                .autorizarPagamento(numeroCartao, valorTotal);

        if(pagamentoAutorizado) {
            imprimirRecibo(valorTotal);
        }
    }

    void imprimirRecibo(double valorTotal) {
        System.out.println("========== RECEBIDO DE PAGAMENTO ==========");
        System.out.printf("Valor total: R$ %.2f%n", valorTotal);
    }

    double calcularValorTotal() {
        double subTotal = calcularSubTotal();
        double taxaServico = calcularTaxaServico(subTotal);
        double valorTotal = subTotal + taxaServico;
        return valorTotal;
    }


    double calcularTaxaServico(double subTotal) {
        return subTotal * TAXA_SERVICO_PADRAO;
    }

    double calcularSubTotal() {
        return produto.precoUnitario * quantidadeItens;
    }

}
