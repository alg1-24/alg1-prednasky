/*
 * Copyright (C) 2024 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */
package p07.trida_objekty_metody;

/**
 * Ukazka knihovni tridy.
 *
 * @author Jirina
 *
 * Metody, parametry, typ, return. 
 * Dokumentacni komentar, overeni platnosti parametru.
 * Jednotlive metody neusi byt zcela kompletni.
 */
public final class MathTools {

    private MathTools() {
    }

    /**
     * Zjisteni poctu delitelu cisla.
     * @param cislo cele kladne cislo.
     * @return pocet vlastnich delitelu nebo 0, 
     * pokud bylo zadano nekladne cislo;
     */
    public static int pocetDelitelu(int cislo) {
        if (cislo == 0) {
            return 0;
        }
        if (cislo < 0) {
            return 0;
            // v jine variante by bylo mozno 
            // zjistit pocet delitelu pro odpovidajici kladne
        }
        int pd = 0;
        for (int d = 2; d <= cislo / 2; d++) {
            if (cislo % d == 0) {
                pd++;
            }
        }
        return pd;
    }

    /**
     * Zjisti, zda zadane cislo je prvocislo.
     * @param cislo cele cislo
     * @return true, pokud cislo je prvocislo, v libovolnem jinem
     * pripade (i pro nekladna cisla) vraci false
     */
    public static boolean jePrvocislo(int cislo) {
        // test parametru
        if (cislo <= 0) return false;
        // trivialni pripady
        if (cislo == 1) return false;
        if (cislo < 4) return true;
        // algoritmus zjistujici vlastnost
        for (int d = 2; d * d <= cislo; d++) {
            if (cislo % d == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Nejvetsi spolecny delitel dvou celych kladnych cisel.
     * Neoveruje platnost parametru.
     * @param a cele kladne cislo
     * @param b cele kladne cislo
     * @return nejvetsi spolecny delitel
     */
    public static int nsd(int a, int b) {
        // podminky na paremetry: a, b kladna, a > b
        // Eukliduv algoritmus
        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
    }

    /**
     * Nejvetsi spolecny delitel dvou celych kladnych cisel.
     * Neoveruje platnost parametru.
     * @param a cele kladne cislo
     * @param b cele kladne cislo
     * @return nejvetsi spolecny delitel
     */
    public static int nsd2(int a, int b) {
        // podminky na paremetry: a, b kladna, a > b
        // Jiny, presto stale efektivni postup
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    /**
     * Nejmensi spolecny nasobek dvou celych cisel.
     * Neoveruje platnost parametru.
     * @param a cele kladne cislo
     * @param b cele kladne cislo
     * @return nejmensi spolecny nasobek cisel
     */
    public static long nsn(int a, int b) {
        // podminky na paremetry: a, b kladna, a > b
        if (b == 0) {
            return a;
        }
        return a * b / nsd(a, b);
    }

}
