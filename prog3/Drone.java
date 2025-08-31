package transport;

public class Drone extends Vehicle implements IPayable {

	public Drone(String id) {
		super(id);
		System.out.println("Drone() constructor is called");
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public double cost(double distancekm)
	{
		return 20*distancekm;
		
	}

	@Override
	public void deliver(String item, String place) {
		if(!SecurityRules.canFly(place))
		{
			System.out.println("Delivery to " +place+ " is blocked by security");
			return;
			
		}
		// TODO Auto-generated method stub
System.out.println("Delivering "+ item +" to" +place +" by Drone");
	}
	

}
