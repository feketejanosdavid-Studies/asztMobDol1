// Fekete János Dávid
// https://github.com/feketejanosdavid
// SZOFT II/1/N
// 2024.10.07
// Main.java

package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hálózati kapcsolat szimuláló program");
        System.out.println("Fekete János Dávid, II/1/N");

        Network network = new Network();

        network.connectToNetwork("Internet");
        network.disconnectFromNetwork();
    }
}