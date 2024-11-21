/*
 * Copyright (C) 2024 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */
package p08.pole;

import java.util.Scanner;

/**
 * Metody pro nacteni, vypis a zpracovani dat v poli.
 * @author Jirina
 */
public class poleZpracovani2_Metody {

    private static final Scanner sc = new Scanner(System.in);
    private static final int MAX_POCET_HODNOT = 1000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] pole = new int[MAX_POCET_HODNOT];
        int n = nactiDataDoPole(pole);
        vypisPole(pole, n, "Nactena data");
        int max = maximum(pole, n);
    }

    private static int nactiDataDoPole(int[] a) {
        int cislo;
        int n = 0;
        System.out.println("Zadavej cela kladna cisla, ukonci nekladnym");
        while ((cislo = sc.nextInt()) > 0) {
            a[n] = cislo;
            ++n;
            if (n == a.length) {
                System.out.println("Nedostatek pameti pro ulozeni dalsich dat");
                System.out.println("Nacitani dat ukonceno");
                break;
            }
        }
        sc.nextLine();
        return n;
    }
    
    private static void vypisPole(int[] a, int n, String titulek) {
        System.out.println("");
        System.out.println(titulek);
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }
    
    private static int maximum (int[] a, int n){
        // pro prazdne pole
        // - vratit minimum typu int
        // - nebo generovat vyjimku
        // pouze pro neprazdne pole
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max)max = a[i];
        }
        return max;
    }

}
