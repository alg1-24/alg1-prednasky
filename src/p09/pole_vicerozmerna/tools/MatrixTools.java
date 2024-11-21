/*
 * Copyright (C) 2024 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */
package p09.pole_vicerozmerna.tools;

/**
 * Knihovni trida.
 * Vlastnost matice.
 * Vymena radku, sloupcu v existujici matici.
 * Chybi dokumentacni komentare metod.
 * @author Jirina
 */
public final class MatrixTools {

    private MatrixTools() {
    }
    
    public static boolean jeSymDleVert(int[][] a){
        for (int[] v : a) {
            for (int i = 0; i < v.length/2; i++) {
                if (v[i] != v[v.length-1-i]) return false;
            }
        }
        return true;
    }
    
    public static boolean jeSymDleHoriz(int[][] a){
        throw new UnsupportedOperationException("Neimplementovano");
    }
    
    public static boolean jeSymDleDiag(int[][] a) {
        throw new UnsupportedOperationException("Neimplementovano");
    }
    
    public static int[][] soucet(int[][] a, int[][] b) {
        throw new UnsupportedOperationException("Neimplementovano");
    }
    
    public static double[][] soucet(double[][] a, double[][] b) {
        throw new UnsupportedOperationException("Neimplementovano");
    }
    
    public static void vymenRadky(int[][] a, int r1, int r2) {
       int[] pom = a[r1];
        a[r1] = a[r2];
        a[r2] = pom;
    }
    
    public static void vymenSloupce(int[][] a, int s1, int s2) {
        for (int[] v : a) {
            int pom = v[s1];
            v[s1] = v[s2];
            v[s2] = pom;
        }
    }

}
