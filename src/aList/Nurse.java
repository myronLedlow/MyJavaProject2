package aList;

public class Nurse extends Employee {
//Subclass fields
private int numpatients;

//Subclass constructor
	// calls the super class constructor
	// I place my setters in this constructor
public Nurse(String role,String name, String blazer, int numpatients) {
	super(role,name,blazer);
	this.numpatients = numpatients;
}

//Getter methods 

public int getNumpatients() {
	return numpatients;
}


// Subclass DIsplay(toString()) method

public String Display() {
	return super.Display() + "  " + "Number of patients: " + this.getNumpatients();
}





}
