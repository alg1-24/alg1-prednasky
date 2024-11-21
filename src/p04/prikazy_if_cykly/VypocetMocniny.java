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
public class VypocetMocniny {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadej zaklad ");
        double a = sc.nextDouble();
        System.out.println("zadej mocninu(cele nezaporne cislo)}");
        int n = sc.nextInt();
        
        // cykly while a for
        // vypocet celociselne kladne mocniny prostým soucinem
        double vysl;
        
        // 1
        vysl = 1;
        int i = 0;
        while (i < n) {  // n-krat
            vysl *= a;
            i++;
        }
        System.out.println(vysl);
        
        // 2
        vysl = 1;
        for (int k = 0; k < n; k++) {
            vysl *= a;
        }
        
        
    }

}
