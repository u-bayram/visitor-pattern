package com.example.visitor.car;

/**
 * @author UmutBayram
 */
public interface CarVisitor {
    void visit(BmwCar bmwCar);
    void visit(VolkswagenCar volkswagenCar);
}
