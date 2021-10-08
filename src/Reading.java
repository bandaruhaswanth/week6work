public class Reading implements State
{

	Magazine magazine;
	
	public Reading(Magazine magazine) {
		this.magazine = magazine;
	}

	@Override
	public void start() {
		System.out.println("Reading Start");	

	}

	@Override
	public void stop() {
		System.out.println("Reading End");	

	}

	
}
