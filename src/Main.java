public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo");
        System.out.println("Filme: Top gun Maverick");
        //bem vindo e nome do filme
        int anoDeLancamento  = 2022;
        System.out.println ("Ano de lacamento: " + anoDeLancamento);
        //ano de lancamento
        String descricaoTopGunMaverick =("O filme conta a historia do piloto Maverick junto dos seus companheiros " +
                "de equipe, e o filho do seu antigo companheiro de equipe Goosse");
        System.out.println(descricaoTopGunMaverick);
        //descricao do filme
        boolean incluidoNoPlano = false;
        double notaFilme = 9.1;
        double notaDoFilmeCritica = 8.0;
        System.out.println("Nota do Filme pelo publico: "+notaFilme);
        System.out.println("Nota do Filme pela critica: "+notaDoFilmeCritica);
        double media = (9.1 + 8.0) /2;
        //media do artimetica do filme
        String  mediaDosPublicos = (" A media aritimetica do filme foi de: " + media);
        System.out.println(mediaDosPublicos + " o filme teve uma boa avaliacao!");
        //meritos finais
        // casting implicito
        int  x = 10;
        double y = x;
        //casting explicito
        double a = 10.5;
        int b = (int) x;
    }
}