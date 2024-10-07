// Fekete János Dávid
// https://github.com/feketejanosdavid
// SZOFT II/1/N
// 2024.10.07
// Romb.java

package com.example;

import java.util.Scanner;

public class Romb {
    public void calcRomb() {
        Scanner sc = new Scanner(System.in);

        System.out.print("A rombusz e átlója: ");
        Double e = sc.nextDouble();

        System.out.print("A rombusz f átlója:");
        Double f = sc.nextDouble();

        double terulet = (e*f)/2;
        System.out.println("A rombusz területe: " + terulet);

        sc.close();
        
    }
}
