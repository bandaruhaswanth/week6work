import java.util.ArrayList;
import java.util.List;

public abstract class Win {
	String name;
	List<String> item = new ArrayList<String>();
	
	public abstract Win research();
	public abstract Win devlopement();
	
	public Magazine build() {
		Magazine magazine = new Magazine();
		magazine.setNameOfState(this.name);
		magazine.addItems(item);
		return magazine;
	}
	public String toString() {
		return "Winner";
	}
}
