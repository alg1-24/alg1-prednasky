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
public class NacteniCiselZadanyPocet {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nacteni cisel
        System.out.println("Zadej pocet");
        int n = sc.nextInt();
        System.out.format("Zadej cisla %n");
        // opakovane nacitani
        // pocet opakovani vyjadreny explicitne vyrazem
        // vhodne pouzit cyklus for
        for (int i = 0; i < n; i++) {
            double d = sc.nextDouble();
            // zpracovat cislo
        }
    }

}
