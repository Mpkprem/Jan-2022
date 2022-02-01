package org.Partial;

public class Office extends Employee {
	
	public void officeName() {
		System.out.println("Airtel");
	}
	@Override
	public void empId() {
		// TODO Auto-generated method stub
		System.out.println("12345");
	
	}
	@Override
	public void empLocation() {
		// TODO Auto-generated method stub
		System.out.println("Trichy");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Office details = new Office();
		details.officeName();
		details.empId();
		details.empName();
		details.empLocation();
		
		
	}

}
