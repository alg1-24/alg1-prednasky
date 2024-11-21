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
public class TestUsporadanosti {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadej pocet");
        int n = sc.nextInt();
        System.out.format("Zadej cisla %n");

        boolean jeUsp = true;
        if (n > 0) {
            float pred = sc.nextFloat();
            for (int i = 1; i < n; i++) {
                float cislo = sc.nextFloat();
                if (cislo < pred) {
                    jeUsp = false;
                }
                pred = cislo;
            }
        }
        // jeUsp je pouzitelne dale pouze pro n>0

        System.out.println("");
        System.out.println("Zadavej kladna cisla, ukonci nekladnym");
        float cislo;
        jeUsp = false;
        float pred = sc.nextFloat();
        if (pred > 0.) {
            jeUsp = true;
            while ((cislo = sc.nextFloat()) > 0.) {
                if (cislo < pred) {
                    jeUsp = false;
                }
                pred = cislo;
            }
        }
        // jeUsp
    }

}
