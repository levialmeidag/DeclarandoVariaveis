public class Desconto {
    public static void main(String[] args) {

        // A variável precoOrignal, representa o preço de um determinado produto.
        double precoOriginal = 199.90;
        // A variável percentualDesconto, representa o desconto que o precoOrinal receberá.
        double percentualDesconto = 20;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);


    }
}
