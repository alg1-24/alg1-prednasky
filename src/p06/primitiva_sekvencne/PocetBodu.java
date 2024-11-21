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
public class PocetBodu {

    private static final Scanner sc = new Scanner(System.in);
    private static final float EPS = 1E-6f;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pocty bodu v/na/vne kruznici
        System.out.println("Zadej pozici stredu a polomer kruznice");
        float sx = sc.nextFloat();
        float sy = sc.nextFloat();
        float r = sc.nextFloat();
        // pouzita presnost porovnani vztazena k abs. hodnote testovanych cisel
        // zde r - polomer kruznice, vzdy kladne cislo,pokud ne jedna se o chybny vstup 
        float eps = r * EPS; 
        
        System.out.println("Zadej pocet");
        int n = sc.nextInt();
        System.out.format("Zadej souradnice bodu %n");
        int pin = 0;
        int pon = 0;
        int pout = 0;
        for (int i = 0; i < n; i++) {
            float x = sc.nextFloat();
            float y = sc.nextFloat();
            float vzd = (float) Math.hypot(x-sx, y-sy);
            // rozliseni dvou pripadu in/out
            //if (vzd <= (r + eps)) {
            //    pin++;
            //} else {
            //    pout++;
            //}
            
            // rozliseni vsech tri pripadu - in/on/out
            if (Math.abs(vzd - r) < eps) {
                pon++;
            } else if (vzd < r){
                pin++;
            } else {
                pout++;
            }
        }
    }

}
