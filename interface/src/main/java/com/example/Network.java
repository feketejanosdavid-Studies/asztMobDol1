// Fekete János Dávid
// https://github.com/feketejanosdavid
// SZOFT II/1/N 
// 2024.10.07
// Network.java

package com.example;

public class Network implements Connectable {

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Kapcsolódott ehhez a hálózathoz: "+ networkName);
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Megszakadt a hálózattal a kapcsolat");
    }
    
}
