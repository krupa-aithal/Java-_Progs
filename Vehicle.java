package transport;

public abstract class Vehicle {
	protected String id;
	

	public Vehicle(String id) {
		System.out.println("Vehicle() constructor is called");
		
		// TODO Auto-generated constructor stub
	}
	public abstract void deliver(String item,String place);
	

}
