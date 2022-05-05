package br.edu.univas;
import java.util.Scanner;

public class Problem1040 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float n1 = scan.nextFloat(), n2 = scan.nextFloat(), n3 = scan.nextFloat(), n4 = scan.nextFloat(), media, mediaFinal;

        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

        if (media >= 7.0){
            System.out.printf("%s%.1f\n", "Media: ", media);
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5.0){
            System.out.printf("%s%.1f\n", "Media: ", media);
            System.out.println("Aluno reprovado.");
        }
        else {
            System.out.printf("%s%.1f\n", "Media: ", media);
            System.out.println("Aluno em exame.");
            float nExame = scan.nextFloat();
            System.out.println("Nota do exame: " + nExame);
            mediaFinal = (media + nExame) / 2;
            if (mediaFinal > 5.0){
                System.out.println("Aluno aprovado.");
            }
            else {
                System.out.println("Aluno reprovado");
            }
            System.out.printf("%s%.1f\n","Media final: ", mediaFinal);
        }
    }
}
