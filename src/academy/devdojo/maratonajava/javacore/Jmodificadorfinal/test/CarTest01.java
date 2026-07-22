package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.FINAL_VELOCITY); //It isn't correct to access const by reference variable
        System.out.println(Car.FINAL_VELOCITY);

        car.BUYER.setName("Felipe");
        System.out.println(car.BUYER);

    }
}
