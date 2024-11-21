/*
 * Copyright (C) 2024 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */
package p07.trida_objekty_metody;

/**
 *
 * @author Jirina
 */
public class Bod {
    private double x;
    private double y;
    private static int pocetBodu = 0;
    
    public Bod (double a, double b) {
        x = a;
        y = b;
        pocetBodu++;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public static int getPocetBodu(){
        return pocetBodu;
    }
    
    public double vzd() {
        return Math.hypot(x, y);
    }
}
