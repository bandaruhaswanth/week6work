
public class Establish implements State
{

	Magazine magazine;
	
	public Establish(Magazine magazine) {
		this.magazine = magazine;
	}

	@Override
	public void start() {
		System.out.println("Establish start");	

	}

	@Override
	public void stop() {
		System.out.println("Establish End");	

	}

	
}
