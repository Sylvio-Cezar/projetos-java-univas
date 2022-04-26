package br.edu.univas;

public class StartApp {
    public static void main(String[] args)
    {
        //Cálculo de idade
        System.out.println("-----------------------------------");
        int anoNascimento = 2003;
        int anoAtual = 2022;
        int idade = anoAtual - anoNascimento;
        System.out.println(" ");
        System.out.println("Sua idade está entre: " + (idade-1) + "-" + idade + " anos.");
        System.out.println(" ");

        //Operações com duas variáveis
        System.out.println("-----------------------------------");
        int a = 11;
        int b = 2;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        System.out.println("Divisão inteira: " + f);
        int g = a % b;
        System.out.println("Resto da divisão inteira: " + g);
        float h = (float) a / b;
        System.out.println("Divisão com float: " + h);

        int j = 10;
        System.out.println("10 " + j);
        System.out.println(j + " 10");

        //String contatenada grande
        System.out.println(" ");
        System.out.println("-----------------------------------");
        String nome = "Sylvio";
        System.out.println("Nome: " + nome + " | " + " Idade: " + (idade-1) + "-" + idade);

        //Incrementando e decrementando variáveis
        System.out.println(" ");
        System.out.println("-----------------------------------");
        j += 1;
        j++;
        j = j + 1;
        System.out.println(j);
        j -= 1;
        j--;
        j = j -1;
        System.out.println(j);

        System.out.println(" ");
        int abc = 10;
        System.out.println(abc);
        abc++;
        System.out.println(abc);
        abc--;
        System.out.println(abc);

        System.out.println(" ");
        System.out.println(abc++);
        System.out.println(abc);

        System.out.println(" ");
        System.out.println(++abc);
        System.out.println(abc);
        System.out.println(--abc);
        System.out.println(abc);

        //Mais operações com variáveis
        System.out.println(" ");
        System.out.println("-----------------------------------");
        int x = 10;
        System.out.println(x);
        x = x + 15;
        System.out.println(x);
        x += 15;
        System.out.println(x);
        x -= 15;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        x /= 3;
        System.out.println(x);
    }
}
