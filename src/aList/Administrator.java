package aList;

public class Administrator extends Employee {
	
	//Subclass fields
	private String dept;
	
	//Subclass constructor
		// calls the super class constructor
		// I place my setters in this constructor
	public Administrator(String role,String name, String blazer,String dept) {
		super(role,name,blazer);
		this.dept = dept;
	}
	
	//Getter methods 
	public String getDept() {
		return dept;
	}
	
	// Subclass Display(toString()) method
	public String Display() {
		return super.Display() + "  " + "Department: " + this.getDept();
	}
	
	
	
	
		
}
