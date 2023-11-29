package org.example;

import org.example.problema.BurgerOrderService;
import org.example.problema.OrderService;

public class Main {
    public static void main(String[] args) {
        OrderService service = new BurgerOrderService(new PrintStreamAdapter());

        service.orderBurger(1);
    }
}