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
public class PoleZpracovani1_Metody {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] pole = nactiPole();
        vypisPole2(pole, "Nactena data");
        float s = soucet(pole);
        System.out.println("Soucet hodnot je " + s);
    }
    
    private static float[] nactiPole() {
        System.out.println("Zadej pocet hodnot");
        int n = sc.nextInt(); sc.nextLine();
        float[] a = new float[n];
        System.out.println("Zadej jednotlive hodnoty ");
        for (int i = 0; i < n; i++) {
            a[i]  = sc.nextFloat();
        }
        sc.nextLine();
        return a;
    }
    
    private static void vypisPole(float[] a, String titulek) {
        System.out.println("");
        System.out.println(titulek);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }
    
    private static void vypisPole2(float[] a, String titulek) {
        System.out.println("");
        System.out.println(titulek);
        for (float f : a){
            System.out.print(" " + f);
        }
        
        System.out.println();
    }
    
    private static float soucet(float[] a) {
        float s = 0;
        for (float x : a) {
            s += x;
        }
        return s;
    }
    
    private static int poziceMaxima(float[] a) {
        if (a.length < 1) return -1;
        int pos = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[pos]) {
                pos = i;
            }
        }
        return pos;
    }

}
