package test;

public class Member {
	String ssn, name, uid;// 재활용컵 계속쓸수있다.

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUid() {
		return uid;
	}

	public String calcGender(String ssn) {
		char ch = this.ssn.charAt(7);
		String gender = "";
		switch (ch) {
		case '1':
		case '3':
			gender = "남자";
			break;
		case '2':
		case '4':
			gender = "여자";
			break;
		case '5':
		case '6':
			gender = "외국인";
			break;
		}
		return gender;
	}

}
