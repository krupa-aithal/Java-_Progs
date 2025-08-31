package main;

import transport.Drone;
import transport.EBike;

public class Main {
	public static void main(String[]args) {
		EBike e=new EBike("EB-101",50);
		e.deliver("Sandwitch","Library");
		Drone d=new Drone("DR=1");
		d.deliver("notes","examcell");
		d.deliver( " USB","CSE block");
		double bill=d.cost(5);
		System.out.println("Drone delivery cost Rs"+bill);
		
	}

	
}
