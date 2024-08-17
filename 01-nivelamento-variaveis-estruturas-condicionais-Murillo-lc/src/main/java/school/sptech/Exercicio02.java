package school.sptech;

public class Exercicio02 {
    public static void main(String[] args) {
        Integer aquecimento = 5;
        Integer aerobico = 12;
        Integer musculacao = 50;
        Integer minutosTotais = aquecimento + aerobico + musculacao;
        Integer calorias = (aquecimento*12) + (aerobico*20) + (musculacao*25);

        System.out.println(String.format("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias.",minutosTotais, calorias ));

    }
}
