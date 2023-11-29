package org.example.problema;

import org.example.Output;

public class BurgerOrderService implements OrderService {

    private final Output output;

    public BurgerOrderService(Output output) {
        this.output = output;
    }

    @Override
    public void orderBurger(int quantity) {
        output.out("Received order of "+quantity+" burgers");
    }

    @Override
    public void orderFries(int fries) {
        throw new UnsupportedOperationException("No fries in burger only order");
    }

    @Override
    public void orderCombo(int quantity, int fries) {
        throw new UnsupportedOperationException("No combo in burger only order");
    }
}
