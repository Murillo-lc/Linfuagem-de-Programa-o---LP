package school.sptech;

public class Exercicio03 {
    public static void main(String[] args) {
        Integer valorProduto = 15;
        Integer qtdVendida = 3;
        Integer valorPago = 50;
        Integer troco = valorPago - (valorProduto*qtdVendida);

        System.out.println(String.format("Seu troco será de R$%d, onde %d é o valor a ser devolvido ao cliente.", troco, troco));
    }
}
