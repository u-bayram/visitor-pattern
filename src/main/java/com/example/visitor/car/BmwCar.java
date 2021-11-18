package com.example.visitor.car;

/**
 * @author UmutBayram
 */
public class BmwCar implements Car {
    @Override
    public void drive() {
        System.out.println(this.getClass().getName() + " drive...");
    }

    @Override
    public void accept(CarVisitor carVisitor) {
        carVisitor.visit(this);
    }
}
