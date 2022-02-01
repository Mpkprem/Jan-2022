package org.Fully;

public class Business implements Client {

	public static void main(String[] args) {
		Business bus = new Business();
		bus.businessName();
		bus.clientName();
		bus.clientId();
		bus.clientAge();

	}
	private void businessName() {
		System.out.println("Win");

	}

	@Override
	public void clientId() {
		System.out.println("Client ID is : 1234567");		
	}

	@Override
	public void clientName() {
System.out.println("Client Name is Santhosh");		
	}

	@Override
	public void clientAge() {
System.out.println("Client age is 50");		
	}
	

}
