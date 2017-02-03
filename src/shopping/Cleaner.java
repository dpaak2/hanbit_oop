package shopping;

public class Cleaner extends Product{
	private String power;
	public Cleaner(){
		super(300);
	}
	public String getName() {
		return "청소기";
	}
	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Cleaner [name=" +getName()+ ", price=" +super.getPrice()+ "]";
	}
	

}
