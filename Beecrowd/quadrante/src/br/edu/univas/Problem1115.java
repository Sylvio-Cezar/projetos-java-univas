package br.edu.univas;
import java.util.Scanner;

public class Problem1115 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 1, y = 1;

        while (x != 0 && y != 0){
            x = scan.nextInt();
            y = scan.nextInt();

            if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0){
                System.out.println("terceiro");
            }
            else if (x > 0 && y < 0){
                System.out.println("quarto");
            }
        }
    }
}
