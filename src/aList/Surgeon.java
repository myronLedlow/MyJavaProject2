package aList;

public class Surgeon extends Employee {
	//Subclass fields
	private String special;
	private String operate;
	
	//Subclass constructor
		// calls the super class constructor
		// I place my setters in this constructor
	public Surgeon( String role,String name, String blazer,String special,String operate) {
		super(role,name,blazer);
		this.special = special;
		this.operate = operate;
	}
	
	// Getter methods
	public String getSpecial() {
		return special;
	}
	
	
	public String getOperate() {
		return operate;
	}
	// Subclass Display(toString()) method
	public String Display() {
		return super.Display()  + " " + "Speciality: "  + this.getSpecial() + " " + "Operating: " + this.getOperate() ; 
	}
	
}
