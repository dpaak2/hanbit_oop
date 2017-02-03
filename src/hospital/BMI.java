package hospital;

public  class BMI extends Treatment {	
	private double height=0,weight=0;
	public void setHeight(double height){
		this.height=height;
	}
	public double getHeight(){
		return height;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
	public double getWeight(){
		return weight;
	}
	@Override
	public String treat() {
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

    
