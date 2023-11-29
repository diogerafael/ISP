package org.example.problema;

import org.example.Output;

public class FriesOrderService implements OrderService {

    private final Output output;

    public FriesOrderService(Output output) {
        this.output = output;
    }

    @Override
    public void orderBurger(int quantity) {
        throw new UnsupportedOperationException("No burger ");
    }

    @Override
    public void orderFries(int fries) {
        output.out("Received order of "+fries+" fries");
    }

    @Override
    public void orderCombo(int quantity, int fries) {
        throw new UnsupportedOperationException("No combo in burger only order");
    }
}
