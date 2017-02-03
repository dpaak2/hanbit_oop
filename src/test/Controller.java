package test;

import java.util.Scanner;
import test.Member;
import javax.swing.*;

import hospital.BMI;
public class Controller {
	
	public void start(){
		Scanner s=new Scanner(System.in);
		int i=0;
		String ssn= ""; //local variable
		String uid="";
		String gender="";
		Member member= new Member();
		/*BMI bmi=new BMI();*/
		/*Member member=null; //instance (객체의 초기값은)  null이다. 생성자와 선언이 분리 될수있다.
*/		
		while(true){
		/*	String option= JOptionPane.showInputDialog("어떤 작업을 원하시나요? 0.종료 1.회원등록2.BMI측정 3.성별입력 3.lotto 4.성적표");*/
/*			System.out.println("어떤 작업을 원하시나요? 1.회원등록2.BMI측정 3.성별입력 3.lotto 4.성적표 0.종료");
*/			/*int opt= Integer.parseInt(option);
			String opt2=String.valueOf(opt);
			double opt=double.parsedouble(option);
			int selector=s.nextInt();*/
			switch(JOptionPane.showInputDialog("어떤 작업을 원하시나요? 0.종료 1.회원등록2.BMI측정 3.lotto 4.성적표")){
			case "0": return;
			case "1":	
			
				//input ssn
				while(true){ //validation 유호성 체크
				member =new Member();
				ssn=JOptionPane.showInputDialog("주민번호를 입력하세요");
				char ch = ssn.charAt(7);
				 //local variable(종이컵) initialize
				if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
					JOptionPane.showMessageDialog(null,"다시 입력하세요");
				}else{
					break;
					}
				}//한석규 (남)
				member .setSsn(ssn);
				gender=member.calcGender(gender);		
				//String gender=member.getGender(member.ssn);
				//input ID
				member.setName(JOptionPane.showInputDialog("이름: "));
				member.setUid(JOptionPane.showInputDialog("ID:"));
				JOptionPane.showMessageDialog(null,member.getName()+"("+member.calcGender(gender)+")" );
				break; 
			
			
					
			case "3"://lotto
				break;
			case "4": 
				ReportCard card= new ReportCard();
				System.out.print("Name:");
				card.setName(s.next());
				int score=0,total=0;
				for(i=0;i<6;i++){
					System.out.println("Score:");
					System.out.println("If you want to stop,Type -1");
					System.out.println("If the number of subject is 6, Auto quit!! ");
					score=s.nextInt();
					total += score;
				}
				card.setTotal(total);
			    card.setAverage(total/6);
			    card.calGrade(card.getAverage());
			    
				System.out.println("Name:" + card.getGrade());
				System.out.println("Total=" + card.getTotal());
				System.out.println("Average=" + card.getAverage());
				System.out.println("Grade " + card.getGrade());
				break;
			case "5":
				
				break;
			}
		}
	}
	}
	


	

