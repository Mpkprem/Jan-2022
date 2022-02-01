package org.Partial;

public class Child extends Parents {

	public static void main(String[] args) {
	
		Child chi = new Child();
		chi.childName();
		chi.daddyId();chi.daddyName();
		chi.daddyAge();
		
	}
private void childName() {
	System.out.println("Name is Partha");
}
@Override
public void daddyName() {
	System.out.println("Daddy name is Sarath");
	
}
@Override
public void daddyAge() {
	System.out.println("Age is 65");	
}
private void daddyId() {
	System.out.println("Daddy ID is : 1234");

}
}
