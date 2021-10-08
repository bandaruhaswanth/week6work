import java.util.List;

public class Magazine {
	State establish;
	State reading;
	State writing;
	State listening;
	State close;
	
	State s;
	String name;
	List<String> cycles;
	public Magazine()
	    {
	    	establish = new Establish(this);
	    	reading = new Reading(this);
	    	writing = new Writing(this);
			listening = new Listening(this);
	    	close = new Close(this);    
	    }
	void addItems(List<String> cycles) {
		this.cycles = cycles;
	}
 
	void process() {
		System.out.println("process " + name + " and :");
		for (String cycle : cycles) {
			System.out.println("   " + cycle);
		}
	}
	public void start() {

		s.start();
	}

	public void stop() {

		s.stop();
	}
 
	public void setNameOfState(String name) {
		this.name = name;
	}

	
	public State getState() {
		return s;
	}
	public void setState(State s) {
		this.s = s;
	}
	public String getNameOfStat() {
		return name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append(this.name + "\n");
		for (String cycle : cycles) {
			display.append(cycle + "\n");
		}
		return display.toString();
	}
}


