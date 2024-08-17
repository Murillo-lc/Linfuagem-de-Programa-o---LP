package school.sptech;

public class Exercicio01 {
    public static void main(String[] args) {
        Integer filhosPequenos = 2;
        Integer filhosAdolescentes = 1;
        Integer filhosVelhos = 0;
        Double bolsaP = 25.12;
        Double bolsaM = 15.88 ;
        Double bolsaG = 12.44;
        Integer totalFilhos = filhosPequenos + filhosAdolescentes + filhosVelhos;
        Double totalBolsa = (filhosPequenos * bolsaP) + (filhosAdolescentes * bolsaM) + (filhosVelhos * bolsaG);

        System.out.println(String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa", totalFilhos, totalBolsa));


    }
}
