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
public class NacitaniUkonceneOdpovedi {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // opakovane reseni jiste ulohy
        // predem nelze vyjadrit pocet opakovani
        // vhodne pouzit while nebo do-while
        boolean pokracovat = true;
        while (pokracovat) {
            // reseni zadane ulohy
            System.out.println("Zpracovani ulohy");
            System.out.println("");
            // nabidka uzivateli - dotaz na ukonceni/pokracovani
            
            char o;
            do {
                System.out.print("Pokracovat a/n y/n? ");
                o = sc.next().charAt(0);
                o = Character.toLowerCase(o);
            } while (o != 'n' && o != 'a' && o != 'y');
            if (o == 'n') {
                pokracovat = false;
            }
            //pokracovat = !(o == 'n');
            
//            System.out.print("Pokracovat a/n ano/ne y/n yes/no?");
//            String o2;
//            o2 = sc.nextLine().trim().toUpperCase();
//            if (o2.equals("N") || o2.equals("NE") || o2.equals("NO")) {
//                pokracovat = false;
//            }
            //pokracovat = !(o2.equals("N") || o2.equals("NE") || o2.equals("NO"));
        }
    }

}
