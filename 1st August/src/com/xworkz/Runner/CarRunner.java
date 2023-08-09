package com.xworkz.Runner;
import com.xworkz.Implementation.Car;
import com.xworkz.Implementation.Bus;
public class CarRunner {
	public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
        

        Bus bus = new Bus();
        bus.start();
        bus.stop();
    }
}


