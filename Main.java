package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        discriminant();
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();

        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();

        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();

        int delta = (double) (Math.pow(b, 2) - 4 * a * c);

        if (delta == 0){
            int x0 = -(b/(2*a));
            System.out.println("Ce polynome a une racine double x0 = " + x0);

        } else if (delta > 0){
            int x1 = ((-b-Math.sqrt(delta))/(2*a));
            int x2 = ((-b+Math.sqrt(delta))/(2*a));
            System.out.println("Ce polynome a deux racines simples x1 = " + x1 + " et x2 = " + x2);

        }else if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
        }
    }
}
