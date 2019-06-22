package com.java.siit.oop.garage_app;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GarageService {

    List<Car> cars = new ArrayList<>();

    /**
     * This method is used to program cars to the service
     */
    public void addCar(Car car) {
        cars.add(car);
//        cars.get(0);
//        cars.set(0, car);
//        cars.remove(car);//necesita ca obiectul din lista sa suprascrie equals()
    }

    public boolean deliverCar(Car car) {
        if (!car.isBroken()) {
            System.out.println("The cars is ready now, thank you!");
            return cars.remove(car);
        }
        throw new IllegalStateException("The car is broken, you cannot deliver it, idiot!!!");
    }

    public void listCarsFromService() {
//        for (Car car : cars) {
//            System.out.println(car);
//        }

        cars.forEach(car -> {
            System.out.println(car.toString());

            //
        });
    }

    public void repairCar(Car car) {
        if (car.isBroken()) {
            car.setBroken(false); //o repara
            System.out.println("The cars is repaired now, you can camo to pick it up!");

            //return;
        } else {
            throw new IllegalStateException("The car was not broken!!!");
        }
    }
}
