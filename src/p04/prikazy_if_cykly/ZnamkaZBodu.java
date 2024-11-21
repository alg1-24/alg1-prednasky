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
public class ZnamkaZBodu {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b = 93;
        int zn;
        final int MIN1 = 95;
        final int MIN2 = 85;

        // pouziti if - else if
        // prevod poctu bodu na znamku
        // celociselne literaly - castecne nahrazeny pojmenovanymi hodnotami (promenne, konstanty) 
        // kod neni dostatecne obecny 
        // 1
        if (b >= MIN1) {
            zn = 1;
        } else if (b >= MIN2) {
            zn = 2;
        } else if (b >= 70) {
            zn = 3;
        } else if (b >= 55) {
            zn = 4;
        } else {
            zn = 5;
        }

        // 2
        if (b < 55) {
            zn = 5;
        } else if (b <= 70) {
            //..
        } else //...
            
        System.out.println(zn);

    }

}
