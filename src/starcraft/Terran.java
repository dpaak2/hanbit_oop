package starcraft;

public class Terran extends Unit { //일을 시키는것 처럼 보인다.
	private boolean fly;
	public Terran(String name,boolean fly){
		super.name=name;
		super.energy=100;
		this.fly=fly;
	}
	@Override
	public void decEnergy() { //실행하지 않는 method
				//umimplement method로 걸어 주면 
	}

}
