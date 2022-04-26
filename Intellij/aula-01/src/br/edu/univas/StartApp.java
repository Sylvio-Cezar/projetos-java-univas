package br.edu.univas;

public class StartApp {

    //Hello World com modificações
    public static void main(String[] args) {
        for(int i = 1; i <= 10; ++i) {
            if ((i % 2 != 0 || i % 3 != 0) && (i % 2 != 0 || i % 5 == 0)) {
                System.out.println("#" + i);
            } else {
                System.out.println("#" + i + " Hello World");
            }
        }

        //Variáveis Básicas
        System.out.println(" ");
        int idade = 10;

        System.out.println(idade);
        System.out.println("idade");

        String nome = "Sylvio Cézar Rezende Pereira";
        System.out.println(nome);

        float peso = 25.5F;
        System.out.println(peso);

        //Tipos primitivos
        short a = 10;
        byte b = 11;
        int c = 12;
        long d = 13;
        float e = 14.4F;
        double f = 15.5;
        char g = 'S';
        boolean h = true;

        //Tipos de Strings vazias
        String nomeADefinir = "";
        String cidade = null;
        System.out.println(nomeADefinir);
        System.out.println((String)cidade);

        /*
        Tipos de comentários
        Simples: //
        Múltiplas linhas: /**/
    }
}
