package aList;

public class Janitor extends Employee {
//Subclass fields
private String dept;
private String sweep;

//Subclass constructor
	// calls the super class constructor
	// I place my setters in this constructor
public Janitor(String role,String name, String blazer,String dept,String sweep) {
	super(role,name,blazer);
	this.dept = dept;
	this.sweep = sweep;
}

//Getter methods
public String getDept() {
	return dept;
}

public String getSweep() {
	return sweep;
}


//Subclass Display(toString()) method
public String Display() {
	return super.Display() + "  " + "Department: " + this.getDept() + " " + "Sweeping: " + this.getSweep();
}



}
