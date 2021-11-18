package com.example.visitor.car;

public class CarCruiseControlVisitor implements CarVisitor {
    @Override
    public void visit(BmwCar bmwCar) {
        System.out.println(bmwCar.getClass().getName() + " add car cruise control.");
    }

    @Override
    public void visit(VolkswagenCar volkswagenCar) {
        System.out.println(volkswagenCar.getClass().getName() + " dont add car cruise control.");
    }
}
