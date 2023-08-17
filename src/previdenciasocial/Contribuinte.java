package previdenciasocial;

public class Contribuinte {

    static final int IDADE_MINIMA_APOSENTADORIA = 65;

    int idade;
    int tempoContribuicaoEmAnos;

    boolean estaElegivelParaAposentadoria() {

        return this.idade >= IDADE_MINIMA_APOSENTADORIA;

    }

}
