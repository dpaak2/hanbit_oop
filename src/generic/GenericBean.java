package generic;

public class GenericBean<T> {
	
	private T val; // alrt+ shif+s+r = getter&setter shortcut
	
	public GenericBean(T val){
		this.val=val;
	}

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}
}
