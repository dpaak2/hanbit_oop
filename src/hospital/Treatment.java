package hospital;

public abstract class Treatment{
	protected int treatId,docId,nurId,patId;
	public void setTreatId(int treatId){
		this.treatId=treatId;
	}
	public int getTreatId(){
		return treatId;
	}
	public void setDocId (int docId){
		this.docId=docId;
	}
	public int getDocId(){
		return docId;
	}
	public void setNurId(int nurId){
		this.nurId=nurId;
	}
	public int getNurId(){
		return nurId;
	}
	public void setPatId(int patId){
		this.patId=patId;
	}
	public int getPatId(){
		return patId;
	}
	public abstract String treat();
	
	public String toString() {
		return String.format("BMI: %s",treat());
	}

	}
	
