package main.java.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el año: ");
        year = scanner.nextInt();

        // x%y devuelve el resto de la división x/y
        // x%2 == 0, verifica que x sea par
        if(year%2 != 0) {
            System.out.println(year + " no es bisiesto");
        }else {
            if (year%4 == 0 && year%100 != 0) {
                System.out.println(year + " es bisiesto");
            }else if (year%100 == 0 && year%400 == 0){
                System.out.println(year + " es bisiesto");
            }else {
                System.out.println(year + " no es bisiesto");
            }
        }
    }
}
