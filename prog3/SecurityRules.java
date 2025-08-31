package transport;

public  final class SecurityRules {

	private SecurityRules() {
		// TODO Auto-generated constructor stub
	}

	public static boolean canFly(String place){
		if(place=="examcell")
			return false;
		else
			return true;
		
		// TODO Auto-generated method stub

	}

}
