package org.example.problema;

import org.example.Output;

public class ComboOrderService implements OrderService {

    private final Output output;

    public ComboOrderService(Output output) {
        this.output = output;
    }

    @Override
    public void orderBurger(int quantity) {
        throw new UnsupportedOperationException("No burger ");
    }

    @Override
    public void orderFries(int fries) {
        throw new UnsupportedOperationException("No fries in burger only order");
    }

    @Override
    public void orderCombo(int quantity, int fries) {
        output.out("Received order of "+fries+" fries");
    }
}
