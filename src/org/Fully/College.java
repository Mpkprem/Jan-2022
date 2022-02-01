package org.Fully;

public class College extends Hostel implements Student, NewStudent {
	
	public void collegeName() {
		System.out.println("CHENTECH");
	}
	public void collegeDistrict() {
		System.out.println("Pudukottai");
	}
	public void studentName() {
		System.out.println("Siva");
	}
	@Override
	public void studentId() {
		System.out.println("12345");
	}
	@Override
	public void studentBranch() {
		System.out.println("EEE");
	}
	@Override
	public void newStudentName() {
		System.out.println("Prem Kumar");
	}
	@Override
	public void newStudentAge() {
		System.out.println("23");
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			College name = new College();
			name.collegeName();
			name.collegeDistrict();
			name.studentName();
			name.studentId();
			name.studentBranch();
			name.newStudentName();
			name.newStudentAge();
			name.hostelName();

	}
	
	

}
