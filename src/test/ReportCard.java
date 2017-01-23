package test;

public class ReportCard {
	private int score, total, average; 
	private String name,grade;
	

	public void setScore(int score){
		this.score=score;
	}
	public int getScore(){
		return score;
	}
	public void setTotal(int total){
		this.total=total;
	}
	public int getTotal(){
		return score;
	}
	public void setAverage(int average){
		this.average=average;
		
	}
	public int getAverage(){
		return average;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setGrade(String grade){
		this.grade=grade;
	}
	public String getGrade(){
		return grade;
	}
	
	public  void calGrade(int average) {	
			String grade = "";
			if (average >= 90) {
				grade = "A";
			} else if (average >= 80) {
				grade = "B";
			} else if (average >= 70) {
				grade = "C";
			} else if (average >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
		}
		
	}
