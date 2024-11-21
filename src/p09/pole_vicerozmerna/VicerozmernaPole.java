/*
 * Copyright (C) 2024 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */

package p09.pole_vicerozmerna;

import java.util.Scanner;

/**
 *
 * @author Jirina
 */
public class VicerozmernaPole {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nacteni nekolika vektoru/posloupnosti nestejne delky 
        // do jedineho vicerozmerneho pole
        int[][] data;
        System.out.println("Zadej pocet vektoru");
        int n = sc.nextInt();
        // vytvoreni matice
        data = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.println("zadej delku dilciho vektoru");
            int m = sc.nextInt();
            // vytvoreni dilciho vektoru
            data[i] = new int[m];  
            System.out.println("Zadej data vektoru");
            for (int j = 0; j < m; j++) {
                data[i][j] = sc.nextInt();
            }
        }
        // data 
        // vypis vsech nactenych vektoru/posloupnosti
        System.out.println("");
        for (int[] v : data) {
            for (int c : v) {
                System.out.format("%4d", c);
            }
            System.out.println("");
        }
        
        // dalsi zpracovani dle potreb zadani
        // kod by bylo mozne rovnez clenit do metod 
        
        System.out.println("Koncim ...");
    }

}
