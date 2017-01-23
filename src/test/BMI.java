package test;

public class BMI {
	// instance variable 반드시 initialize 를 하지 않는다.
	private double weight, height;
	private String uid;

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUid() {
		return uid;
	}

	// setter 를 생략하면, readOnly 파일 - 보완에 좋다. (고칠수가 없음)
	public String calcBmi(double height, double weight) {
		String result = "";
		double bmi = 0;
		bmi = weight / (height * height);

		if (bmi > 30.0) {
			result = "고도비만";
		} else if (bmi > 25.0) {
			result = "비만";
		} else if (bmi > 23.0) {
			result = "과체중";
		} else if (bmi > 18.5) {
			result = "정상";
		} else {
			result = "저체중";
		}
		return result;
	}

}
