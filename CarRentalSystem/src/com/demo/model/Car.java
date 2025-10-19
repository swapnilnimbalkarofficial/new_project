package com.demo.model;

public class Car {
	private int carId;
	private String model;
	private String brand;
	private double price;
	private boolean isAvailable;
	
	public Car(int carId, String model, String brand, double price, boolean isAvailable) {
		super();
		this.carId = carId;
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", model=" + model + ", brand=" + brand + ", price=" + price + ", isAvailable="
				+ isAvailable + "]";
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
}
