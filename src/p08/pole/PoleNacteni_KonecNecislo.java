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
public class PoleNacteni_KonecNecislo {

    private static final Scanner sc = new Scanner(System.in);
    private static final int MAX_POCET_HODNOT = 1000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // nacitani cisel
        // algoritmus predpoklada ukonceni vstupu zadanim END (neni case sensitive)
        // tato varianta neresi naplneni kapacity pole
        System.out.println("Zadavej cisla, ukonci zadanim e/end");
        boolean konecNacitani = false;
        double[] a = new double[MAX_POCET_HODNOT];
        int n = 0;
        do {
            if (sc.hasNextDouble()) {
                a[n++] = sc.nextDouble();
            } else {
                String str = sc.next().toUpperCase();
                if (str.equals("E") || (str.equals("END"))){
                    konecNacitani = true;
                } else {
                    System.out.println("Chybny vstup: " + str);
                }
            }
        } while(!konecNacitani);
        System.out.println("Vstupni data nactena");
        System.out.println("");
        
        sc.nextLine();
    }

}
