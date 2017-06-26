package Enumeration;

public enum Weekday {
	Sunday(0),Monday(1),Tuesday(2),Wednesday(3),Thursday(4),Friday(5),Saturday(6);
	int value;
	Weekday(int val){
		value=val;
	}
	int GetValue(){
		return value;
	}
	
}
