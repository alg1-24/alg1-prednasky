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
public class MaximumMinimumFloat {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadej pocet");
        int n = sc.nextInt();
        float max = -Float.MAX_VALUE; // nebo Float.POSITIVE_INFINITY;
        float min = Float.MAX_VALUE;  // nebo Float.NEGATIVE_INFINITY;
        System.out.format("Zadej %d realnych cisel: ", n);
        for (int i = 0; i < n; i++) {
            float cislo = sc.nextFloat();
            if (cislo > max) {
                max = cislo;
            }
            if (cislo < min){
                min = cislo;
            }    
        }
        System.out.format("Maximum %f %n", max);
        System.out.format("Minimum %f %n", min);
    }

}
