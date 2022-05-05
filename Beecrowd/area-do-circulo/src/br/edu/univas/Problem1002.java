package br.edu.univas;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Problem1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.0000");

        double raio = scan.nextDouble(), area;

        area = 3.14159 * (raio * raio);

        System.out.println("A=" + deci.format(area));
    }
}
