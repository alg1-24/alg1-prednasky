/*
 * Copyright (C) 2024 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */
package p07.trida_objekty_metody;

import java.util.Scanner;

/**
 * "Text user interface".
 * Program s textovym menu.
 * Cleneni kodu.
 * Metody - citelne dobre odladitelne fragmenty.
 * Pouziti metod z knihovni tridy.
 * @author Jirina
 */
public class CelaCislaVlastnosti {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean konecProgramu = false;
        while(! konecProgramu){
            vypisMenu();
            int volba = nactiVolbu();
            konecProgramu = obsluzVolbu(volba);
        }
        
        // alternativne pouziti do-while
        //do {
        //    
        //}while(!konecProgramu);
        System.out.println("Koncim ...");
    }

    private static int nactiVolbu() {
        System.out.print("Zadej volbu ");
        int volba = sc.nextInt();
        sc.nextLine();
        return volba;
    }

    private static void vypisMenu() {
        System.out.println("");
        System.out.println("1. Pocet delitelu cisla");
        System.out.println("2. Test prvociselnosti cisla");
        System.out.println("3. Nejvetsi spolecny delitel");
        System.out.println("4. Nejmensi spolecny nasobek ");   
        System.out.println("0. Konec programu");
    }

    private static boolean obsluzVolbu(int volba) {
        // v jednotlivych vetvich switch pouze jeden prikaz
        // zpravidla volani metody, ktera zajisti obsluhu zadane volby
        switch (volba) {
            case 0 : return true;
            case 1 : pocetDeliteluCisla(); break;
            case 2 : prvociselnostCisla(); break;
            case 3 : nejvetsiSpolecnyDelutelCisel(); break;
            case 4 : nejmensiSpolecnyNasobeCisel(); break;
            default: 
                System.out.println("Neplatna volba");
        }
        return false;
    }

    private static void pocetDeliteluCisla() {
        System.out.println("");
        System.out.println("Pocet delitelu");
        System.out.println("Zadej cele kladne cislo");
        int c = sc.nextInt();
        int pocetDel = MathTools.pocetDelitelu(c);
        System.out.println(pocetDel);
    }

    private static void prvociselnostCisla() {
        System.out.println("");
        System.out.println("Prvociselnost");
        System.out.println("Zadej cele kladne cislo");
        int c = sc.nextInt();
        boolean jp = MathTools.jePrvocislo(c);
        System.out.println(jp);
    }

    private static void nejvetsiSpolecnyDelutelCisel() {
        System.out.println("");
        System.out.println("NSD");
        System.out.println("Zadej dve cela kladna cisla");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int nsd = MathTools.nsd(a, b);
        System.out.println(nsd);
    }

    private static void nejmensiSpolecnyNasobeCisel() {
        System.out.println("");
        System.out.println("NSN");
        System.out.println("Zadej dve cela kladna cisla");
        int a = sc.nextInt();
        int b = sc.nextInt();
        long nsn = MathTools.nsn(a, b);
        System.out.println(nsn);
    }
}
