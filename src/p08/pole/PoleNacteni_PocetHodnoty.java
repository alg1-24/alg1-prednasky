/*
 * Copyright (C) 2024 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */

package p08.pole;

import java.util.Scanner;

/**
 *
 * @author Jirina
 */
public class PoleNacteni_PocetHodnoty {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nacteni data do pole
        // na vstupu nejprve pocet, potom hodnoty
        System.out.println("Zadej pocet hodnot");
        int n = sc.nextInt();
        float[] a = new float[n];
        System.out.println("Zadej jednotlive hodnoty ");
        for (int i = 0; i < n; i++) {
            a[i]  = sc.nextFloat();
        }
        sc.nextLine();
        // manipulace s cisly v poli
        // a - pole s daty
        // a.length
        // kontrolni vypis 
    }

}
