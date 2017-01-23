package hospital;

public class Doctors {
	private String docName,docGen,docPhone, docEmail,docPosition,majorTreat;//database 의 schema 
	private int docId;
	public void setDocName(String docName){
		this.docName=docName;
	}
	public String getDocName(){
		return docName;
	}
	public void setDocGen(String docGen){
		this.docGen=docGen;
	}
	public String getDocGen(){
		return docGen;
	}
	public void setDocPhone(String docPhone){
		this.docPhone=docPhone;
	}
	public String getDocPhone(){
		return docPhone;
	}
	public void setdocEmail(String docEmail){
		this.docEmail=docEmail;
	}
	public String getDocEmail(){
		return docEmail;
	}
	public void setDocPosition(String docPosition){
		this.docPosition= docPosition;
	}
	public String getDocPosition(){
		return docPosition;
	}
	public void setMajorTreat(String majorTreat){
		this.majorTreat=majorTreat;
	}
	public String getMajorTreat(){
		return majorTreat;
	}
	public void setDocId(int docId){
		this.docId=docId;
	}
	public int getDocId(){
		return docId;
	}
	
	
	
	}

