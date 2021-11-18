package com.example.visitor.car;
/**
 * @author UmutBayram
 */
public class VolkswagenCar implements Car {
    @Override
    public void drive() {
        System.out.println(this.getClass().getName() + " drive...");
    }

    @Override
    public void accept(CarVisitor carVisitor) {
        carVisitor.visit(this);
    }
}
