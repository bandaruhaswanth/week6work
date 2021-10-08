
public class Writing implements State
{

	Magazine magazine;
	
	public Writing(Magazine magazine) {
		this.magazine = magazine;
	}

	@Override
	public void start() {
		System.out.println("Writing Start");	

	}

	@Override
	public void stop() {
		System.out.println("Writing ENd");	

	}

	
}
