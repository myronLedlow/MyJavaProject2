package aList;

public class Employee {
	// Super Class Fields
	private String name;
	private String blazer;
	private String role;
	// Super class Constructor
	// I place my setters in this constructor
	public Employee( String role,String name, String blazer) {
		
		this.role = role;
		this.name = name;
		this.blazer = blazer;
		
		
	}
		
	
	
		
		
	// Getter methods
	
	
	public String getRole() {
		return role;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public String getBlazer() {
		return blazer;
	}
	// Super class Display(toString()) method
	public String Display() {
		return   "Name: " + this.getName() + " "   + "Blazer id: " + " " + this.getBlazer();
	}
	

}
