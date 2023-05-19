package aList;

public class Doctor extends Employee{
	//Subclass fields
	
	private String special;
//Subclass constructor
	// calls the super class constructor
	// I place my setters in this constructor
	public Doctor(String role,String name,String blazer,String special) {
		super(role,name, blazer);
		this.special = special;
	}
	
	
	
	
	// Getter Methods
	
	public String getSpecial() {
		
		
		return special;
	}
	
	
	// Subclass Display(toString() method
	public String Display() {
		return super.Display() +   "  " + "Speciality: " + this.getSpecial();
	}
	
}
