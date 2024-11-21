/*
 * Copyright (C) 2024 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */
package p09.pole_vicerozmerna;

import java.util.Scanner;
import p09.pole_vicerozmerna.tools.MatrixTools;

/**
 *
 * @author Jirina
 */
public class MaticeNacteniVypisTest {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean konecProgramu = false;
        while (!konecProgramu) {
            int[][] mat = nactiMatici();
            if (mat == null) {
                System.out.println("Zadan neplatny/nekladny rozmer matice");
                konecProgramu = true;
            } else {
                vypisMatici(mat, "Zadana matice");
                boolean jeSym = MatrixTools.jeSymDleVert(mat);
                System.out.format("Matice %s symetricka dle vertikalni osy %n",
                        jeSym?"je":"neni");
                MatrixTools.vymenRadky(mat, 1, 2);
                vypisMatici(mat, "Po vymene radku 1, 2");
                MatrixTools.vymenSloupce(mat, 1, 2);
                vypisMatici(mat, "Po vymene sloupcu 1, 2");
            }
        }

    }

    private static int[][] nactiMatici() {
        System.out.println("");
        System.out.print("Zadej pocet radku a sloupcu ");
        int m = sc.nextInt();
        if (m <= 0) return null;
        int n = sc.nextInt();
        if (n <= 0) return null;
        int[][] a = new int[m][n];
        System.out.println("zadej data matice po radcich");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

    private static void vypisMatici(int[][] a, String popisek) {
        System.out.println("");
        System.out.println(popisek);
//        for (int r = 0; r < a.length; r++) {
//            for (int s = 0; s < a[r].length; s++) {
//                System.out.format("%4d", a[r][s]);
//            }
//            System.out.println("");
//        }
        for (int[] v : a){
            for(int c : v) {
                System.out.format("%4d", c);
            }
            System.out.println();
        }
    }

    
}
