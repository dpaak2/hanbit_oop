package hospital;

public class Nurses extends Member {
	String nurPosition,majorJob;
	
	public void setNurPosition(String nurPosition){
		this.nurPosition=nurPosition;
	}
	public String getNurPosition(){
		return nurPosition;
	}
	public void setMajorJob(String majorJob){
		this.majorJob= majorJob;
	}
	public String getMajorJob(){
		return majorJob;
	}
	@Override
	public String toString() {
		return String.format(
				"간호사Id: %s\n"
						+ "담당 진료과목: %s\n"
						+ "성명: %s\n"
						+ "성별: %s\n"
						+ "전화번호: %s\n"
						+ "이메일:%s\n"
						+ "직급:%s\n"
						,uid
						,majorJob
						,name
						,super.calcGender(ssn)
						,phone
						,email
						,nurPosition);
	}
}
