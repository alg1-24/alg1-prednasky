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
public class NacteniUkonceneTerm2 {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadavej kladna cisla, ukonci zadanim necisla");
        // opakovane nacitani a zpracovani cisel
        // predem nelze vyjadrit pocet opakovani
        // vhodne pouzit while nebo do-while
//        while (sc.hasNextDouble()) {
//            // zpracovani cisla
//            double d = sc.nextDouble();
//            System.out.println("Zpracovani cisla");
//
//        }
//        String term = sc.next();
//        System.out.println("Vstup ukoncen zadanim " + term);

        boolean pokracovat = true;
        do {
            if (sc.hasNextDouble()) {
                double d = sc.nextDouble();
                System.out.println("Zpracovani cisla");
                
            } else {
                String str = sc.next().toUpperCase();
                if (str.equals("END")) {
                    pokracovat = false;
                } else {
                    System.out.println("Chybne zadana hodnota");
                }
            }
        }while (pokracovat);

    }

}
