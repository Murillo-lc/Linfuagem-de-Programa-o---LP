package school.sptech;

public class Exercicio04 {
    public static void main(String[] args) {
        String nome = "Murillo";
        Integer nota1 = 3;
        Integer nota2 = 8;
        Integer media = (nota1 + nota2)/2;

        System.out.println(String.format("Olá, %s. Sua média foi de %d", nome, media));
    }
}
