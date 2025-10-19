package com.demo.service;

import java.util.List;
import com.demo.model.Car;
import com.demo.model.Customer;
import com.demo.model.Rental;

public class CarRental {

    // Fields with proper plural names
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;

    // Constructor
    public CarRental(List<Car> cars, List<Customer> customers, List<Rental> rentals) {
        this.cars = cars;
        this.customers = customers;
        this.rentals = rentals;
    }

    // Getters and Setters
    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    // Add methods
    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    // Display all available cars
    public void displayAvailableCars() {
        System.out.println("Available Cars:");
        boolean anyAvailable = false;
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car);
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No cars available at the moment.");
        }
    }

    // Rent a car
    public void rentCar(Car car, Customer customer, int days) {
        if (car.isAvailable()) {
            rentals.add(new Rental(car, customer, days));
            car.setAvailable(false);
            System.out.println("Car rented successfully to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Car is not available for rent.");
        }
    }

    // Return a car
    public void returnCar(Car car) {
        if (!car.isAvailable()) {
            car.setAvailable(true);
            System.out.println("Car returned successfully: " + car.getModel());
        } else {
            System.out.println("This car was not rented: " + car.getModel());
        }
    }
}
