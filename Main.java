package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //discriminant();
        //parite();
        //max();
        //min();
    }

    public static void min(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer un nombre x : ");
        int x = scanner.nextInt();

        System.out.println("Entrer un nombre y : ");
        int y = scanner.nextInt();

        if (x-y<0){
            System.out.println("La valeur minimum est "+x);
        }else{
            System.out.println("La valeur minimum est "+y);
        }
    }

    public static void max(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer un nombre x : ");
        int x = scanner.nextInt();

        System.out.println("Entrer un nombre y : ");
        int y = scanner.nextInt();

        if (x-y<0){
            System.out.println("La valeur maximum est "+y);
        }else{
            System.out.println("La valeur maximum est "+x);
        }
    }

    public static void parite() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle est la valeur à tester ?");
        int x = scanner.nextInt();

        if (x%2==0){
            System.out.println(x + " est pair");
        }else {
            System.out.println(x + " est impair");
        }
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle est la valeur de a ?");
        double a = scanner.nextDouble();

        System.out.println("Quelle est la valeur de b ?");
        double b = scanner.nextDouble();

        System.out.println("Quelle est la valeur de c ?");
        double c = scanner.nextDouble();

        int delta = (int) (Math.pow(b, 2) - 4 * a * c);

        if (delta == 0){
            double x0 = -(b/(2*a));
            System.out.println("Ce polynome a une racine double x0 = " + x0);

        } else if (delta > 0){
            double x1 = ((-b-Math.sqrt(delta))/(2*a));
            double x2 = ((-b+Math.sqrt(delta))/(2*a));
            System.out.println("Ce polynome a deux racines simples x1 = " + x1 + " et x2 = " + x2);

        }else if (delta < 0) {
            double r = -(b/(2*a));
            double d1 = (Math.sqrt(-delta)/(2*a));
            System.out.println("Ce polynome n’a pas de racine reelle, r1 = "+r+" + "+d1+"i et r2 = "+r+" - "+d1+"i");

        }
    }
}
