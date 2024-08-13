public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        //ano de lançamento + nota
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.5;

        //Média das notas fo filme + sinopse
        double media = (8.5 + 6.3 + 9.7) /3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de ação";
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}