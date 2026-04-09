public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo");
        System.out.println("Filme: Top gun Maverick");

        int anoDeLancamento  = 2022;
        System.out.println ("Ano de lacamento: " + anoDeLancamento);

        String descricaoTopGunMaverick =("O filme conta a historia do piloto Maverick junto dos seus companheiros " +
                "de equipe, e o filho do seu antigo companheiro de equipe Goosse");
        System.out.println(descricaoTopGunMaverick);
        boolean incluidoNoPlano = false;
        double notaFilme = 9.1;
        double notaDoFilmeCritica = 8.0;
        System.out.println("Nota do Filme pelo publico: "+notaFilme);
        System.out.println("Nota do Filme pela critica: "+notaDoFilmeCritica);
        double media = (9.1 + 8.0) /2;
        String  mediaDosPublicos = (" A media aritimetica do filme foi de: " + media);
        System.out.println(mediaDosPublicos + " o filme teve uma boa avaliacao!");

    }
}