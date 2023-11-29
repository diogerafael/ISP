package org.example;

public class PrintStreamAdapter implements Output{
    @Override
    public void out(String text) {
        System.out.println(text);
    }
}
