package Vehicule;

public abstract class Vehicule {
	
	// Attributes
	private String brand;
	private int kilometers;
	
	// Constructor 
	
	public Vehicule (String brand, int kilometers) {
		this.brand = brand;
		this.kilometers = kilometers; 
	}
	
	// Getter and setter 
	
	public String getBrand() {
		return this.brand;
	}
	public int getKilometers () {
		return this.kilometers;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setKilometers (int kilometers) {
		this.kilometers = kilometers;
	}
	
	// Method abstract
	public abstract String doStuff();
	
}
