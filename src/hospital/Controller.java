package hospital;

import java.util.Scanner;
import javax.swing.*;
import test.BMI;
public class Controller {
	String ssn;
		public static void start(){
		Scanner s =new Scanner(System.in);
		String ssn="";
		BMI bmi=null;
		Doctors doc= null;
		Nurses nur=null;
		Patient pat=null;
		String uid="";
	
/*				+"이름,주민번호(800101-1),이메일,휴대폰,\n");

 * [의사]한석규(남),36세,han@test.com,010-1234-5678
 * [간호사]박신혜(여),25세,park@test.com,010-1234-5678
 * [환자] 홍길동(남),15세,hong@test.com,010-1234-5678
 * 	*/	

		switch(JOptionPane.showInputDialog("역활을 선택하여주세요(의사:1,간호사:2,환자:3")){
			case "1":/*의사*/
			doc =new Doctors();
			doc.setDocName(JOptionPane.showInputDialog("이름"));
				/*doc.setDocName(String name) = s.next();*/
								
		    	ssn=JOptionPane.showInputDialog("주민번호");
		    	
				doc.setdocEmail(JOptionPane.showInputDialog("이메일"));
				JOptionPane.showMessageDialog(null,doc.getDocName()+"("+doc.getDocGen()+ssn.charAt(0)+ssn.charAt(1)+"년생"+")"+doc.getDocEmail());
			/*	doc.docEmail=s.next();*/
			//	System.out.printf("%s(%s)(%s%s년생)%s" ,doc.docName,jumin.getGender(jumin.ssn),jumin.ssn.charAt(0) ,jumin.ssn.charAt(1),doc.docEmail);
				break;		
			case "2": 
				nur =new Nurses();
				nur.nurName=JOptionPane.showInputDialog("이름");
				System.out.println("주민번호");
				ssn=JOptionPane.showInputDialog("주민번호");
				nur.nurEmail=JOptionPane.showInputDialog("이메일");
				JOptionPane.showMessageDialog(null,nur.nurName+"("+nur.getNurGen()+ssn.charAt(0)+ssn.charAt(1)+"년생"+")"+nur.nurEmail);
				break;
			case "3": 
				pat=new Patient();
				pat.setPatName(JOptionPane.showInputDialog("이름"));
				ssn=JOptionPane.showInputDialog("주민번호");
				pat.setPatEmail(JOptionPane.showInputDialog("이메일"));
				JOptionPane.showMessageDialog(null,pat.getPatName()+pat.getPatGen()+"("+ssn.charAt(0)+ssn.charAt(1)+"년생"+")"+pat.getPatEmail());
				break;
				
		}
		
	}

}
