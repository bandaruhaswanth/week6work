public class Listening implements State
{

	Magazine magazine;
	
	public Listening(Magazine magazine) {
		this.magazine = magazine;
	}

	@Override
	public void start() {
		System.out.println("Listning start");	

	}

	@Override
	public void stop() {
		System.out.println("Listening end");	

	}

	
}
