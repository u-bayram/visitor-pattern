package com.example.visitor;

import com.example.visitor.car.BmwCar;
import com.example.visitor.car.CarCruiseControlVisitor;
import com.example.visitor.car.CarVisitor;
import com.example.visitor.car.VolkswagenCar;

public class VisitorPatternExample {

    public static void main(String[] args) {

        BmwCar bmwCar = new BmwCar();
        VolkswagenCar volkswagenCar = new VolkswagenCar();

        CarVisitor carVisitor = new CarCruiseControlVisitor();

        bmwCar.drive();
        volkswagenCar.drive();

        bmwCar.accept(carVisitor);
        volkswagenCar.accept(carVisitor);

    }
}
