package com.demo.main;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Car;
import com.demo.model.Customer;
import com.demo.model.Rental;
import com.demo.service.CarRental;

public class Main {

	public static void main(String[] args) {
		
		List<Car> cars= new ArrayList<>();
		List<Customer> customers= new ArrayList<>();
		List<Rental> rentals= new ArrayList<>();
		
		CarRental system = new CarRental(cars, customers, rentals);		
		
		system.addCar(new Car(1, "Model s", "Tesla", 5000.0, true));
		system.addCar(new Car(2, "fortuner", "Toyota", 8000.0, true));
		system.addCar(new Car(3, "Grand Vitara", "Suzuki", 6000.0, true));
		
		system.addCustomer(new Customer(101,"Swapnil", 9604329196L,1234534334L));
		
		System.out.println("All Available Cars: ");
		for(Car car:system.getCars()) {
			System.out.println(car);
		}
		
		System.out.println("All Customers: ");
		for(Customer customer:system.getCustomers()) {
			
			System.out.println(customer);
			System.out.println("-------------------------------------------------------------");
		}
	
		 Car carToRent = system.getCars().get(0);
	     Customer customer = system.getCustomers().get(0);
	     system.rentCar(carToRent, customer, 2);
	
	     system.returnCar(carToRent);
	}

}
