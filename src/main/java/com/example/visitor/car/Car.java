package com.example.visitor.car;
/**
 * @author UmutBayram
 */
public interface Car {
    void drive();
    void accept(CarVisitor carVisitor);
}
