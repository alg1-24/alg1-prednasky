/*
 * Copyright (C) 2024 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */
package p04.prikazy_if_cykly;

import java.util.Scanner;

/**
 *
 * @author Jirina
 */
public class NacteniCisel {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nacist data/cisla ze vstupu
        // nacist vsechna kladna cisla 
        // zadavani/nacitani ukonceno nekladnou hodnotou
        float soucet;

        // 1 - cyklus while
        System.out.println("Zadej kladne cislo ukonci nekladnym");
        float x = sc.nextFloat();
        while (x > 0) {
            // zpracuj cislo x
            System.out.println("Zadej dalsi kladne cislo ukonci nekladnym");
            x = sc.nextFloat();
        }
        System.out.println("Nacitani ukonceno");
        System.out.println("");

        // 2 - cyklus while, kompaktnejsi zapis
        System.out.println("Zadavej cisla ukonci nekladnym");
        while ((x = sc.nextFloat()) > 0) {
            // zpracuj cislo x
        }
        System.out.println("");

        // 3 - cyklus do-while
        // vypocet souctu
        System.out.println("Zadavej cisla ukonci nekladnym");
        soucet = 0;
        do {
            x = sc.nextFloat();
            if (x > 0) {
                // zpracuj cislo x           
                soucet = soucet + x;
            }
        } while (x > 0);
        //soucet -= x;
        System.out.println(soucet);
        
        // 4
        // cyklus for pro tyto ucely neni prilis vhodny
        System.out.println("Zadavej cisla ukonci nekladnym");
        soucet = 0;
        for (x = sc.nextFloat(); x > 0; x = sc.nextFloat() ){
            soucet = soucet + x;
        }

    }

}
