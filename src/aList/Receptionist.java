package aList;

public class Receptionist extends Employee {
	//Subclass fields
	
	private String dept;
	private String talking;
	
	//Subclass constructor
		// calls the super class constructor
		// I place my setters in this constructor
public Receptionist(String role,String name,String blazer,String dept, String talking) {
	super(role,name,blazer);
	this.dept = dept;
	this.talking = talking;
}

//Getter methods
public String getDept() {
	return dept;
}

public String getTalking() {
	return talking;
}

//Subclass Display(toString()) method
public String Display() {
	return super.Display() + "  " + "Department : " + this.getDept() + " " + "Talking : " + this.getTalking();
}




}
