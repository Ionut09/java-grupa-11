package com.java.siit.oop.garage_app;

import java.util.List;

public class GarageApp {
    static GarageService service = new GarageService();

    public static void main(String[] args) {
        //programam masinile la service
        service.addCar(new Car("Logan", "B-999-TRE", true));
        service.addCar(new Car("Toyota Corolla", "B-999-DJB", true));
        service.addCar(new Car("Hyundai i30", "B-999-GDT", true));
        service.addCar(new Car("Logan", "B-999-QWP", true));
        service.addCar(new Car("Mercedes", "B-923-WEB", false));

        service.listCarsFromService();
        List<Car> cars = service.getCars();

        Car loganTre = cars.get(0);
        service.repairCar(loganTre);
        //service.repairCar(cars.get(4));

        service.deliverCar(loganTre);

        service.listCarsFromService();


    }
}
