/*
 * Copyright (C) 2024 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */

package p09.pole_vicerozmerna;

import java.util.Scanner;

/**
 *
 * @author Jirina
 */
public class MaticeStatickyInit {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // vicerozmerne pole vytvorene pomoci statickeho inicializatoru
        double[][] jednMat = {
            {1., 0., 0.}, 
            {0., 1., 0.}, 
            {0., 0., 1.}};
    }

}
