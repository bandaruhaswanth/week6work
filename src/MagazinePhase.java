

public class MagazinePhase extends Win{

	public MagazinePhase() {
		this.name = "Magazine Phase";
	}
	@Override
	public Win research() {
		return this;
	}

	@Override
	public Win devlopement() {
		this.item.add("devlopement");
		return this;	
		}
}
