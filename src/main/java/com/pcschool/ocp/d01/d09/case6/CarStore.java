package com.pcschool.ocp.d01.d09.case6;

public class CarStore {
    public static void main(String[] args) {
        Rideable r = new Rideable() {
            @Override
          public Car getCar(String name) {
              Car car = new Car(name);
              return car;
          }
        };
        Car car = ride.getCar("BMW");
        System.out.println(car1);
        
        Readable ride2 = (name) -> new Car(name);
        Car car2 = ride2.getCar("BMW");
        System.out.println(Car2);
        
        Readable ride3 = (name) -> new Car(name);
        Car car3 = ride3.getCar("BMW");
        System.out.println(Car3);;
    }
    
}
