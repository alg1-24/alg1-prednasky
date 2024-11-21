/*
 * Copyright (C) 2024 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */

package p05.prikazy_switch;

import java.util.Scanner;

/**
 *
 * @author Jirina
 */
public class VypocetVyrazu {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // vypocet jednoduche aritmeticke operace
        // vstup např. 8 + 5 nebo 6 * 7 atd.
        System.out.println("Zadej vyraz");
        float a, b, v;
        char op;
        
//        a = sc.nextFloat(); sc.nextLine();
//        op = sc.nextLine().trim().charAt(0);
//        b = sc.nextFloat(); sc.nextLine();
//        System.out.format("bylo zadano %f %c %f %n", a, op, b);
        
        a = sc.nextFloat(); 
        op = sc.next().charAt(0);
        b = sc.nextFloat(); sc.nextLine();
        System.out.format("%f %c %f = ", a, op, b);  
        switch (op) {
            case '+': v = a + b; break;
            case '-': v = a - b; break;
            case '*': v = a * b; break;
            case '/', ':': v = a / b; break;
            default : v = Float.NaN;
        }
        System.out.format("%f%n", v);  
        

        // 2 - operator nacten do promenne typu String
        System.out.println("");
        System.out.println("Znovu zadej vyraz");
        a = sc.nextFloat(); 
        String op2 = sc.next();
        b = sc.nextFloat(); sc.nextLine();
        System.out.format("%f %s %f = ", a, op2, b);
        switch (op2) {
            case "+" : v = a + b; break;
            case "-" : v = a - b; break;
            case "*" : v = a * b; break;
            case "/", ":": v = a / b; break;
            default  : v = Float.NaN;
        }
        System.out.format("%f %n", v);
        
    }

}
