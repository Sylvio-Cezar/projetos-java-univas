package br.edu.univas;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        //String nome = "Sylvio;
        //int idade = 18;
        Scanner scan = new Scanner(System.in);

        //Leitura de variáveis com Scanner
        System.out.println("Por favor digite seu nome:");
        String nome = scan.nextLine();
        System.out.println("Por favor digite sua idade:");
        int idade = scan.nextInt();
        //Pegar o "Enter" que sobra do nextInt
        scan.nextLine();

        System.out.println(" ");
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);

        System.out.println(" ");
        System.out.println("Por favor digite seu sobrenome:");
        String sobrenome = scan.nextLine();

        System.out.println(" ");
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Nome completo: " + nome + " " + sobrenome);

        System.out.println("Por favor digite seu peso:");
        double peso = scan.nextDouble();
        System.out.println("Peso: " + peso);
    }
}
