package org.example;

public class Main {
    public static void checkScore(double x) {

        if (x > 0 && x <= 50.00) {
            System.out.println("Avarage score");
        } else if (x > 50.00 && x <= 100.00) {
            System.out.println("Very good score");
        } else {
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args) {
        double a = 2.15;
        double b = 50;
        double c = 95.02;
        double d = 100.01;


        try {
            System.out.print("Primo valore: ");
            checkScore(a);
        } catch (ArithmeticException e) {
            System.out.println("Score is out of scale");
        }

        try {
            System.out.print("Secondo valore: ");
            checkScore(b);
        } catch (ArithmeticException e) {
            System.out.println("Score is out of scale");
        }

        try {
            System.out.print("Terzo valore: ");
            checkScore(c);
        } catch (ArithmeticException e) {
            System.out.println("Score is out of scale");
        }

        try {
            System.out.print("Quarto valore: ");
            checkScore(d);
        } catch (ArithmeticException e) {
            System.out.println("Score is out of scale");
        }
    }
}