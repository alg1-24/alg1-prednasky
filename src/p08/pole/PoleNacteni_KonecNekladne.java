/*
 * Copyright (C) 2024 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */
package p08.pole;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jirina
 */
public class PoleNacteni_KonecNekladne {

    private static final Scanner sc = new Scanner(System.in);
    private static final int DELKA = 5; // hodnota vhodna pro otestovani vycerpani kapacity pole

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // varianta 1
        // pri naplneni pole - ukonceni nacitani
        System.out.println("Zadavej cela kladna cisla, ukonci nekladnym");
        int[] a = new int[DELKA];
        int cislo;
        int n = 0;
        while ((cislo = sc.nextInt()) > 0) {
            // zadano platne cislo
            a[n] = cislo;
            ++n;
            if (n == a.length) {
                System.out.println("Nedostatek pameti pro ulozeni dalsich dat");
                System.out.println("Nacitani dat ukonceno");
                break;
            }
        }
        sc.nextLine(); // vyprazdneni akt. radky vstupu
        // a - obsahuje nactene hodnoty
        // n - pocet hodnot v poli
        System.out.println("Pocet hodnot v poli je " + n);
        System.out.println("Data v poli " + Arrays.toString(a));
        System.out.println("");

        // varianta 2
        // pri naplneni pole - realokace
        System.out.println("");
        System.out.println("Znovu a jinak");
        System.out.println("Zadavej cela kladna cisla, ukonci nekladnym");
        a = new int[DELKA];
        n = 0;
        while ((cislo = sc.nextInt()) > 0) {
            if (n == a.length) {
                int[] b = new int[a.length + DELKA];
                //for (int i = 0; i < a.length; i++) {
                //    b[i] = a[i]; // kopie neefektivne
                //}
                System.arraycopy(a, 0, b, 0, a.length);
                a = b;
            }
            a[n] = cislo;
            ++n;
        }
        sc.nextLine();
        System.out.println("Pocet hodnot v poli je " + n);
        System.out.println("Data v poli " + Arrays.toString(a));

        // ukazka Arrays.toString() - viz vyse
        // ukazka Arrays.deepToString()
        System.out.println("");
        int[][] p = {{1, 2, 3, 4}, {5, 6, 7, 8, 9, 10}};
        System.out.println(p);
        System.out.println("Vicerozmerne pole " + Arrays.toString(p));
        System.out.println("Vicerozmerne pole " + Arrays.deepToString(p));
    }

}
