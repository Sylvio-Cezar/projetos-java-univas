package br.edu.univas;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor digite sua idade:");
        int idade = scan.nextInt();

        //Exibir se o usuário é ou não obrigado a votar
        if(idade < 16){
            System.out.println("Você não pode votar!");
        }
        //Intuito apenas de mostrar a condição OU
        else if(idade == 16 || idade == 17){
            System.out.println("Você pode votar mas não é obrigatório!");
        }
        //Intuito apenas de mostrar a condição E
        else if(idade >= 18 && idade <= 65){
            System.out.println("Você precisa votar!");
        }
        else{
            System.out.println("Você pode votar mas não é obrigatório!");
        }

        //Estrutura switch case básica
        switch (idade){
            case 7:
                System.out.println("Você estuda na ª série");
                break;
            case 8:
                System.out.println("Você estuda na 4ª série");
                break;
            case 9:
                System.out.println("Você estuda na 5ª série");
                break;
            default:
                System.out.println("Você não digitou uma idade válida!");
        }

        System.out.println("Obrigado por participar!!!");
    }
}

