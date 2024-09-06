public class Main {

    public static void main(String[] args) {

        GeradorVetores novo = new GeradorVetores();

        OrdenacaoPorInsercao novaOrdenacaoPorInsercao = new OrdenacaoPorInsercao();
        int[] vetorOrdenadoPorInsercao = novaOrdenacaoPorInsercao.ordenacaoInsercao(novo.vetorAleatorio(100));
        exibeArray(vetorOrdenadoPorInsercao);

        OrdenacaoPorSelecao novoOdP = new OrdenacaoPorSelecao();
        int [] vetorOrdenadoPorSelecao = novoOdP.ordenandoPorSelecao(novo.vetorAleatorio(100));
        exibeArray(vetorOrdenadoPorSelecao);
    }

    public static void exibeArray(int[] vetorMantado) {
        for (int i = 1; i <= vetorMantado.length - 1; i++) {
            System.out.println(vetorMantado[i]);
        }
        System.out.println("\b");
    }

}
