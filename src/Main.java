public class Main{

	public static void main(String[] args) {

		Win phases = new MagazinePhase();
		Magazine phase = phases.research().devlopement().build();
		
		phase.setState(new Establish(phase));
		phase.start();
		phase.process();

		phase.setState(new Reading(phase));
		phase.start();
		phase.stop();

		phase.setState(new Writing(phase));	
		phase.start();
		phase.stop();

		phase.setState(new Listening(phase));	
		phase.start();
		phase.stop();
		
		phase.setState(new Close(phase));	
		phase.start();
		phase.stop();
	}
}
