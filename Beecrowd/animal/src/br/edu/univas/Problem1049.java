package br.edu.univas;
import java.util.Scanner;

public class Problem1049 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String p1, p2, p3;

        p1 = scan.nextLine();
        p2 = scan.nextLine();
        p3 = scan.nextLine();

        if (p1.equals("vertebrado") && p2.equals("ave") && p3.equals("carnivoro")){
            System.out.println("aguia");
        }
        else if (p1.equals("vertebrado") && p2.equals("ave") && p3.equals("onivoro")){
            System.out.println("pomba");
        }
        else if (p1.equals("vertebrado") && p2.equals("mamifero") && p3.equals("onivoro")){
            System.out.println("homem");
        }
        else if (p1.equals("vertebrado") && p2.equals("mamifero") && p3.equals("herbivoro")){
            System.out.println("vaca");
        }
        else if (p1.equals("invertebrado") && p2.equals("inseto") && p3.equals("hematofago")){
            System.out.println("pulga");
        }
        else if (p1.equals("invertebrado") && p2.equals("inseto") && p3.equals("herbivoro")){
            System.out.println("lagarta");
        }
        else if (p1.equals("invertebrado") && p2.equals("anelideo") && p3.equals("hematofago")){
            System.out.println("sanguessuga");
        }
        else if (p1.equals("invertebrado") && p2.equals("anelideo") && p3.equals("onivoro")){
            System.out.println("minhoca");
        }

    }
}
