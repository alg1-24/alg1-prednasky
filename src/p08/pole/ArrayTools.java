/*
 * Copyright (C) 2024 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */
package p08.pole;

/**
 *
 * @author Jirina
 */
public final class ArrayTools {
    private ArrayTools() {}
    
    
    public static float soucet(float[] a) {
        float s = 0;
        for (float x : a) {
            s += x;
        }
        return s;
    }
    
    public static int soucet(int[] a) {
        int s = 0;
        for (int x : a) {
            s += x;
        }
        return s;
    }
    
    public static float soucet(float[] a, int n) {
        float s = 0;
        for (int i = 0; i < n; i++) {
            s += a[i];
        }
        return s;
    }
    
    /**
     * Test vzstupneho usporadani prvnich n hodnot v poli realnych cisel.
     * @param a pole hodnot typu float.
     * @param n pocet prvku v poli od indexu 0.
     * @return true v pripade, ze prvnich n hodnot je.
     */
    public static boolean jeUsporadane(float[] a, int n){
       for (int i = 1; i < n; i++) {
           if (a[i] < a[i-1]) {
               return false;
           }
       }
       return true;
    }
    
    public static boolean jeUsporadane(float[] a){
       for (int i = 1; i < a.length; i++) {
           if (a[i] < a[i-1]) {
               return false;
           }
       }
       return true;
    }
}
