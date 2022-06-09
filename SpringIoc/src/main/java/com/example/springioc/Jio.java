package com.example.springioc;

public class Jio implements Sim{


    @Override
    public void calling() {
        System.out.println("Calling successfully");
    }

    @Override
    public void data() {
        System.out.println("data successfully");
    }

    public Jio() {
    }
}
