
public class Close implements State
{

	Magazine magazine;
	
	public Close(Magazine magazine) {
		this.magazine = magazine;
	}

	@Override
	public void start() {
		System.out.println("Closing start");	

	}

	@Override
	public void stop() {
		System.out.println("Closing End");	

	}

	
}