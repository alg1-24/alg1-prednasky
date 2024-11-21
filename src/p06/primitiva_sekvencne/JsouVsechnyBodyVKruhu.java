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
public class JsouVsechnyBodyVKruhu {

    private static final Scanner sc = new Scanner(System.in);
    private static final float EPS = 1E-6f;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program nacte parametry kruznice
        // Dale nacita souradnice bodu
        // Program ma zjistit, zda se vzadane body nachazi v kruhu
        // "V kruhu" zde znamena uvnitr nebo "na kruznici"
        System.out.println("Zadej pozici stredu a polomer kruznice");
        float sx = sc.nextFloat();
        float sy = sc.nextFloat();
        float r = sc.nextFloat();
        float eps = r * EPS;

        System.out.println("Zadej pocet");
        int n = sc.nextInt();
        System.out.format("Zadej souradnice bodu %n");

        boolean jsouVKruhu = true;
        for (int i = 0; i < n; i++) {
            float x = sc.nextFloat();
            float y = sc.nextFloat();
            float vzd = (float) Math.hypot(x - sx, y - sy);
            if (vzd > r + eps) {
                jsouVKruhu = false;
            } 
        }
        // pouziti vysledku
        if (jsouVKruhu) {
            System.out.println("body v kruhu");
        } else {
            System.out.println("alespon jeden bod mimo kruh");
        }
    }

}
