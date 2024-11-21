/*
 * Copyright (C) 2024 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */

package p06.primitiva_sekvencne;

import java.util.Scanner;

/**
 *
 * @author Jirina
 */
public class MaximumMinimumInt {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadej pocet");
        int n = sc.nextInt();
        
        int max = Integer.MIN_VALUE; // dostatecne male cislo
        int min = Integer.MAX_VALUE; // dostatecne velke cislo
        // pokud je rozsah zpracovavanych hodnot omezeny danou ulohou,
        // lze inicializovat i jinak
        System.out.format("Zadej %d celych cisel: ", n);
        for (int i = 0; i < n; i++) {
            // max - max z doposud zadanych
            int cislo = sc.nextInt();           
            if (cislo > max) {
                max = cislo;
            }
            if (cislo < min){
                min = cislo;
            }
        }
        System.out.format("Maximum %d %n", max);
    }

}
