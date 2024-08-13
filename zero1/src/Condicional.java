public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.5;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos que os clientes estão gostando!");
        } else {
            System.out.println("Filmes retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano = true || tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Fazer upgrade de plano para assistir!");
        }
    }
}
