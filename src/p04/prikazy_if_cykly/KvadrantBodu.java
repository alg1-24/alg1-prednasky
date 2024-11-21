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
public class KvadrantBodu {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // urceni kvadrantu bodu roviny 
        // kvadranty rozsireny o osy 
        // cleneni plochy do kvadrantu - uvedeno na prednasce
        // bod dan 
        float x = 12.f, y = -2.f;

        int kv;
        // 1 - opakovane porovnavani hodnot s 0
        if (x >= 0 && y >= 0) kv = 1;
        else if (x < 0 && y >= 0) kv = 2;
        else if (x <= 0 && y < 0) kv = 3;
        else  kv = 4;
        
        // 2 - kazda souradnice porovnana s 0 prave jednou
        if (y >= 0) {
            if (x >= 0) {
                kv = 1;
            } else {
                kv = 2;
            }
        } else if (x <= 0) {
            kv = 3;
        } else {
            kv = 4;
        }

        System.out.println("Kvadrant " + kv);
    }

}
